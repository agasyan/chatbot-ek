package advprog.enterkomputer.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import enterkomputer.utilities.KategoriScrapper;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class KategoriScrapperTest {
    private KategoriScrapper kategoriScrapper;

    @Before
    public void setUp() {
        kategoriScrapper = new KategoriScrapper();
    }

    @Test
    public void testConstructorKategoriScrapperWork() {
        assertNotNull(kategoriScrapper);
    }

    @Test
    public void testKategoriScrapperEnterKomputer() throws IOException {
        String urlEnterKomputer = "https://www.enterkomputer.com/";
        String expected = String.format(String.format("List Kategori Enter Komputer:\n"
                + "Processor\nMotherboard\nHarddisk\nSSD\nVGA Card\nPower Supply\nCasing\n"
                + "LCD\nOptical Drive\nKeyboard & Mouse\nSoftware & OS\nCooler & Fan\n"
                + "Flashdisk\nMemory Card\nUPS & Stabilizer\nNetworking\nModem Portable "
                + "(GSM & CDMA)\nAIO PC & PC Branded\nServer\nNAS\nOffice\nAccessories "
                + "Powerbank & Mobile Adaptor / Charger Enclosure/Docking/Harddisk Case "
                + "Protector Cable / Converter / KVM / Splitter Thermal Pasta Webcam USB "
                + "HUB,Card Reader,PCI / USB Converter,Bluetooth Dongle TV Tuner & TV Box &"
                + " MP3 Gamepad, Steering, Presenter, Gaming Glasses Function Panel & "
                + "Front Panel Converter Neon CCFL\nAudio Speaker Headset Sound Card\n"
                + "Printer & Catridge Printer Cartridge & Toner\nNoteBook & Accessories"
                + " Notebook & Ultrabook Notebook Cooler, Battery, Adaptor, Sparepart,"
                + " Accessories\nTablet & Smartphone Tablet Smartphone Tempered Glass & "
                + "Acc\nDigital Drawing Tablet\nMedia Player\nProjector\nDrone"));
        String urlOut = kategoriScrapper.scrapperWebsite(urlEnterKomputer);
        assertEquals(expected, urlOut);
    }

    @Test
    public void testApiKategori() throws IOException {
        String expected = "Index of /api/product/ Index of /api/product/  Name"
                + "                                                            "
                + "                 Last modified         Size  Description \n"
                + "    Parent Directory                                       "
                + "                          03-Apr-2018 06:35        -       \n"
                + " accessories.json                                          "
                + "                       26-May-2018 01:25     704k       \n"
                + " accessories_simulation.json                              "
                + "                        26-May-2018 01:25     668k       \n"
                + " allinone.json                                              "
                + "                      26-May-2018 01:25     624k       \n"
                + " allinone_simulation.json                                "
                + "                         26-May-2018 01:26     600k       \n"
                + " best_seller.json                                        "
                + "                         26-May-2018 01:25     100k       \n"
                + " casing.json                                             "
                + "                         26-May-2018 01:25     252k       \n"
                + " casing_simulation.json                                  "
                + "                         26-May-2018 01:26     228k       \n"
                + " coolerfan.json                                          "
                + "                         26-May-2018 01:25     204k       \n"
                + " coolerfan_simulation.json                               "
                + "                         26-May-2018 01:26     188k       \n"
                + " drawing.json                                            "
                + "                         26-May-2018 01:25      24k       \n"
                + " drawing_simulation.json                                  "
                + "                        26-May-2018 01:26      20k       \n"
                + " drone.json                                             "
                + "                          26-May-2018 01:25       4k       \n"
                + " drone_simulation.json                                 "
                + "                           26-May-2018 01:26       4k       \n"
                + " flashdisk.json                                        "
                + "                           26-May-2018 01:25     108k       \n"
                + " flashdisk_simulation.json                             "
                + "                           26-May-2018 01:26     100k       \n"
                + " gadget.json                                           "
                + "                           26-May-2018 01:25     200k       \n"
                + " gadget_simulation.json                                "
                + "                           26-May-2018 01:26     192k       \n"
                + " harddisk.json                                        "
                + "                            26-May-2018 01:25     328k       \n"
                + " harddisk_simulation.json                            "
                + "                             26-May-2018 01:26     308k       \n"
                + " headset.json                                        "
                + "                             26-May-2018 01:25     236k       \n"
                + " headset_simulation.json                             "
                + "                             26-May-2018 01:26     220k       \n"
                + " keyboard.json                                      "
                + "                              26-May-2018 01:25     460k       \n"
                + " keyboard_simulation.json                           "
                + "                              26-May-2018 01:26     428k       \n"
                + " lcd.json                                           "
                + "                              26-May-2018 01:25      88k       \n"
                + " lcd_simulation.json                                "
                + "                              26-May-2018 01:26      84k       \n"
                + " memorycard.json                                    "
                + "                              26-May-2018 01:25      76k       \n"
                + " memorycard_simulation.json                         "
                + "                              26-May-2018 01:26      72k       \n"
                + " memoryram.json                                    "
                + "                               26-May-2018 01:25     268k       \n"
                + " memoryram_simulation.json                         "
                + "                               26-May-2018 01:26     244k       \n"
                + " motherboard.json                                  "
                + "                               26-May-2018 01:25     204k       \n"
                + " motherboard_simulation.json                      "
                + "                                26-May-2018 01:26     188k       \n"
                + " networking.json                                   "
                + "                               26-May-2018 01:25     744k       \n"
                + " networking_simulation.json                        "
                + "                               26-May-2018 01:26     708k       \n"
                + " notebook.json                                     "
                + "                               26-May-2018 01:25     700k       \n"
                + " notebook_simulation.json                         "
                + "                                26-May-2018 01:26     668k       \n"
                + " optical.json                                      "
                + "                               26-May-2018 01:25      12k       \n"
                + " optical_simulation.json                           "
                + "                               26-May-2018 01:26       8k       \n"
                + " printer.json                                      "
                + "                               26-May-2018 01:25     472k       \n"
                + " printer_simulation.json                           "
                + "                               26-May-2018 01:26     444k       \n"
                + " processor.json                                    "
                + "                               26-May-2018 01:25      64k       \n"
                + " processor_simulation.json                        "
                + "                                26-May-2018 01:26      60k       \n"
                + " projector.json                                     "
                + "                              26-May-2018 01:25     344k       \n"
                + " projector_simulation.json                         "
                + "                               26-May-2018 01:26     324k       \n"
                + " psu.json                                          "
                + "                               26-May-2018 01:25     124k       \n"
                + " psu_simulation.json                                "
                + "                              26-May-2018 01:26     108k       \n"
                + " server.json                                        "
                + "                              26-May-2018 01:25     276k       \n"
                + " server_simulation.json                             "
                + "                              26-May-2018 01:26     264k       \n"
                + " software.json                                      "
                + "                              26-May-2018 01:25      32k       \n"
                + " software_simulation.json                           "
                + "                              26-May-2018 01:26      28k       \n"
                + " soundcard.json                                    "
                + "                               26-May-2018 01:25      12k       \n"
                + " soundcard_simulation.json                         "
                + "                               26-May-2018 01:26       8k       \n"
                + " speaker.json                                      "
                + "                               26-May-2018 01:25     116k       \n"
                + " speaker_simulation.json                           "
                + "                               26-May-2018 01:26     112k       \n"
                + " ssd.json                                           "
                + "                              26-May-2018 01:25     328k       \n"
                + " ssd_simulation.json                                "
                + "                              26-May-2018 01:26     308k       \n"
                + " test_1.json                                       "
                + "                               14-Nov-2017 09:39      12k       \n"
                + " ups.json                                          "
                + "                               26-May-2018 01:25     300k       \n"
                + " ups_simulation.json                               "
                + "                               26-May-2018 01:26     284k       \n"
                + " vga.json                                         "
                + "                                26-May-2018 01:25     144k       \n"
                + " vga_simulation.json                              "
                + "                                26-May-2018 01:26     136k       \n"
                + " Proudly Served by LiteSpeed Web Server at enterkomputer.com Port 443";
        String apiUrl = "https://enterkomputer.com/api/product/";
        String realOut = kategoriScrapper.scrapperApi(apiUrl);
        assertEquals(expected,realOut);
    }

    @Test
    public void testCatchUrl() throws IOException {
        String invalidUrl = "https://www.enterkomputer.com/404";
        String invalidOut = kategoriScrapper.scrapperWebsite(invalidUrl);
        String expected = "Url 404 Not Found";
        assertEquals(invalidOut,expected);
    }

}
