package advprog.enterkomputer.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import enterkomputer.utilities.KategoriScrapper;
import org.junit.Before;
import org.junit.Test;

public class KategoriScrapperTest {
    private KategoriScrapper kategoriScrapper;

    @Before
    public void SetUp() {kategoriScrapper = new KategoriScrapper();}

    @Test
    public void testConstructorKategoriScrapperWork() {
        assertNotNull(kategoriScrapper);
    }

    @Test
    public void testKategoriScrapperEnterKomputer() throws IOException {
        String urlEnterKomputer = "https://www.enterkomputer.com/";
        String expected = String.format("List Kategori Enter Komputer:\nProcessor\nMotherboard\n"
                + "Harddisk\nSSD\nVGA Card\nPower Supply\nCasing\nLCD\nOptical Drive\nKeyboard & Mouse"
                + "\nSoftware & OS\nCooler & Fan\nFlashdisk\nMemory Card\nUPS & Stabilizer\nNetworking\n"
                + "Modem Portable (GSM & CDMA)\nAIO PC & PC Branded\nServer\nNAS\nOffice\nAccessories "
                + "Powerbank & Mobile Adaptor / Charger Enclosure/Docking/Harddisk Case Protector "
                + "Cable / Converter / KVM / Splitter Thermal Pasta Webcam USB HUB,Card Reader,PCI / "
                + "USB Converter,Bluetooth Dongle TV Tuner & TV Box & MP3 Gamepad, Steering, Presenter, "
                + "Gaming Glasses Function Panel & Front Panel Converter Neon CCFL\nAudio Speaker Headset "
                + "Sound Card\nPrinter & Catridge Printer Cartridge & Toner\nNoteBook & Accessories "
                + "Notebook & Ultrabook Notebook Cooler, Battery, Adaptor, Sparepart, Accessories\nTablet"
                + " & Smartphone Tablet Smartphone Tempered Glass & Acc\nDigital Drawing Tablet\nMedia Player"
                + "\nProjector\nDrone");
        String urlOut = kategoriScrapper.scrapperWebsite(urlEnterKomputer);
        assertEquals(expected, urlOut);
    }

    @Test
    public void testCatchUrl() throws IOException {
        String invalidURL = "https://www.enterkomputer.com/404";
        String invalidOut = kategoriScrapper.scrapperWebsite(invalidURL);
        String expected = "Url 404 Not Found";
        assertEquals(invalidOut,expected);
    }
}
