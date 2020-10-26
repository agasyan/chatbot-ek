package enterkomputer.utilities;

import java.io.IOException;
import java.util.stream.Collectors;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class KategoriScrapper {
    /*
    public static void main(String[]args) throws IOException {
        KategoriScrapper kategoriScrapper = new KategoriScrapper();
        String urlEnterKomputer = "https://www.enterkomputer.com/api/product";
        System.out.println(kategoriScrapper.scrapperApi(urlEnterKomputer));
    }
    */

    public KategoriScrapper() {

    }

    public String scrapperWebsite(String urlEnterKomputer) throws IOException {
        try {
            Document document = Jsoup.connect(urlEnterKomputer).get();
            Elements headerNoHov = document.select("li.main-kata");
            return "List Kategori Enter Komputer:\n"
                    + headerNoHov.stream().map(katName -> headerRawUtils(katName))
                    .collect(Collectors.joining("\n"));
        } catch (HttpStatusException e) {
            return "Url 404 Not Found";
        }
    }

    public String scrapperApi(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.text();
    }

    private String headerRawUtils(Element header) {
        String tmp = header.select("li.main-kata").text();
        return header.text();
    }
}
