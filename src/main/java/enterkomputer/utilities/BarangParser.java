package enterkomputer.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BarangParser {
    ArrayList<JSONObject> jsonObjects = new ArrayList<>();
    boolean kategoriExist = true;

    /*
    public static void main(String[]args) throws IOException {
        BarangParser barangParser = new BarangParser("asasa");
        System.out.println(barangParser);
    }
    */

    public BarangParser(String categoryName) throws IOException {
        try {
            URL apiUrl = new URL("https://enterkomputer.com/api/product/" + categoryName
                    + ".json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    apiUrl.openStream()));
            String apiReadLine = bufferedReader.readLine();
            JSONParser jsonParser = new JSONParser();
            try {
                Object object = jsonParser.parse(apiReadLine);
                JSONArray jsonArray = (JSONArray) object;
                for (int i = 0; i < jsonArray.size(); i++) {
                    JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                    jsonObjects.add(jsonObject);
                }

            } catch (ParseException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            kategoriExist = false;
        }
    }

    public ArrayList<JSONObject> getJsonObjects() {
        return jsonObjects;
    }

    public boolean isKategoriExist() {
        return kategoriExist;
    }

    public ArrayList<String> getNames() {
        ArrayList<String> result = new ArrayList<>();
        for (JSONObject obj: jsonObjects) {
            result.add(((String) obj.get("name")).toLowerCase());
        }
        return result;
    }

}
