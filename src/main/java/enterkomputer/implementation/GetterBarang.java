package enterkomputer.implementation;

import com.linecorp.bot.model.message.TextMessage;
import enterkomputer.utilities.BarangParser;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;

public class GetterBarang {
    private BarangParser barangParser;

    public GetterBarang(String category) throws IOException {
        barangParser = new BarangParser(category);
    }

    public TextMessage searchProduct(String name) {
        String out = "";
        ArrayList<String> barangName = barangParser.getNames();
        if (!barangParser.isKategoriExist()) {
            return new TextMessage("Kategori Is not Exist");
        }
        for (String something: barangName) {
            if (something.contains(name)) {
                String outAppend = outManager(barangParser, barangName.indexOf(something));
                if (out.length() + outAppend.length() > 2000) {
                    break;
                }
                out += outAppend;
            }
        }
        if (out.equals("")) {
            return new TextMessage("No product listed with that name");
        }
        out = out.substring(0,out.length() - 1);
        return new TextMessage(out);
    }

    public String outManager(BarangParser barangParser, int cursorPos) {
        ArrayList<JSONObject> jsonObjects = barangParser.getJsonObjects();
        JSONObject current = jsonObjects.get(cursorPos);
        String res = current.get("name") + " - " + current.get("category_description")
                + " - "  + current.get("price") + "\n";
        return res;
    }
}
