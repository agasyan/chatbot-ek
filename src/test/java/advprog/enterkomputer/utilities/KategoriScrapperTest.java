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
    public void testApiKategori() throws IOException {
        String expected = String.format("Index of /api/product/ Index of /api/product/"
                + "  Name                                                               "
                + "              Last modified         Size  Description \n    Parent Di"
                + "rectory                                                              "
                + "   03-Apr-2018 06:35        -       \n accessories.json              "
                + "                                                   22-May-2018 03:43 "
                + "    708k       \n accessories_simulation.json                        "
                + "                              22-May-2018 03:43     668k       \n all"
                + "inone.json                                                           "
                + "         22-May-2018 03:43     624k       \n allinone_simulation.json"
                + "                                                         22-May-2018 "
                + "03:43     600k       \n best_seller.json                             "
                + "                                    22-May-2018 03:43     100k       \n"
                + " casing.json                                                         "
                + "             22-May-2018 03:43     252k       \n casing_simulation.json"
                + "                                                           22-May-2018"
                + " 03:43     228k       \n coolerfan.json                               "
                + "                                    22-May-2018 03:43     204k       \n"
                + " coolerfan_simulation.json                                             "
                + "           22-May-2018 03:43     188k       \n drawing.json            "
                + "                                                         22-May-2018 03:43"
                + "      24k       \n drawing_simulation.json                               "
                + "                           22-May-2018 03:43      20k       \n drone.json"
                + "                                                                       "
                + "22-May-2018 03:43       4k       \n drone_simulation.json              "
                + "                                              22-May-2018 03:43       4k"
                + "       \n flashdisk.json                                               "
                + "                    22-May-2018 03:43     108k       \n flashdisk_simul"
                + "ation.json                                                        22-May"
                + "-2018 03:43     100k       \n gadget.json                               "
                + "                                       22-May-2018 03:43     200k       \n"
                + " gadget_simulation.json                                                   "
                + "        22-May-2018 03:43     192k       \n harddisk.json                 "
                + "                                                   22-May-2018 03:43     "
                + "328k       \n harddisk_simulation.json                                   "
                + "                      22-May-2018 03:43     308k       \n headset.json   "
                + "                                                                  22-May-2018"
                + " 03:43     236k       \n headset_simulation.json                         "
                + "                                 22-May-2018 03:43     220k       \n "
                + "keyboard.json                                                            "
                + "        22-May-2018 03:43     460k       \n keyboard_simulation.json     "
                + "                                                    22-May-2018 03:43    "
                + " 428k       \n lcd.json                                                  "
                + "                       22-May-2018 03:43      88k       \n lcd_simulation.json"
                + "                                                              22-May-2018 "
                + "03:43      84k       \n memorycard.json                                   "
                + "                               22-May-2018 03:43      76k       "
                + "\n memorycard_simulation.json                                            "
                + "           22-May-2018 03:43      72k       \n memoryram.json            "
                + "                                                       22-May-2018 03:43"
                + "     268k       \n memoryram_simulation.json                            "
                + "                            22-May-2018 03:43     244k       \n motherbo"
                + "ard.json                                                                 "
                + "22-May-2018 03:43     204k       \n motherboard_simulation.json         "
                + "                                             22-May-2018 03:43     184k  "
                + "     \n networking.json                                                 "
                + "                 22-May-2018 03:43     744k       \n networking_simulation"
                + ".json                                                       22-May-2018 "
                + "03:43     708k       \n notebook.json                                   "
                + "                                 22-May-2018 03:43     696k       "
                + "\n notebook_simulation.json                                             "
                + "            22-May-2018 03:43     668k       \n optical.json           "
                + "                                                          22-May-2018 "
                + "03:43      12k       \n optical_simulation.json                       "
                + "                                   22-May-2018 03:43       8k       \n "
                + "printer.json                                                           "
                + "          22-May-2018 03:43     472k       \n printer_simulation.json  "
                + "                                                        22-May-2018 03:43"
                + "     444k       \n processor.json                                        "
                + "                           22-May-2018 03:43      64k       \n "
                + "processor_simulation.json                                                "
                + "        22-May-2018 03:43      60k       \n projector.json               "
                + "                                                    22-May-2018 03:43    "
                + " 344k       \n projector_simulation.json                                "
                + "                        22-May-2018 03:43     324k       \n psu.json     "
                + "                                                                    "
                + "22-May-2018 03:43     124k       \n psu_simulation.json                    "
                + "                                          22-May-2018 03:43     112k       "
                + "\n server.json                                                             "
                + "         22-May-2018 03:43     276k       \n server_simulation.json        "
                + "                                                   22-May-2018 03:43     "
                + "264k       \n software.json                                              "
                + "                      22-May-2018 03:43      32k       \n software_simul"
                + "ation.json                                                         22-May-"
                + "2018 03:43      28k       \n soundcard.json                                "
                + "                                   22-May-2018 03:43      12k       \n sound"
                + "card_simulation.json                                                        "
                + "22-May-2018 03:43       8k       \n speaker.json                           "
                + "                                          22-May-2018 03:43     116k       "
                + "\n speaker_simulation.json                                                 "
                + "         22-May-2018 03:43     108k       \n ssd.json                      "
                + "                                                   22-May-2018 03:43     "
                + "328k       \n ssd_simulation.json                                          "
                + "                    22-May-2018 03:43     308k       \n test_1.json        "
                + "                                                              14-Nov-2017 "
                + "09:39      12k       \n ups.json                                          "
                + "                               22-May-2018 03:43     300k       \n ups_simu"
                + "lation.json                                                              "
                + "22-May-2018 03:43     284k       \n vga.json                              "
                + "                                           22-May-2018 03:43     144k      "
                + " \n vga_simulation.json                                                    "
                + "          22-May-2018 03:43     136k       \n Proudly Served by LiteSpeed "
                + "Web Server at enterkomputer.com Port 443");
        String apiUrl = "https://enterkomputer.com/api/product/";
        String realOut = kategoriScrapper.scrapperApi(apiUrl);
        assertEquals(expected,realOut);
    }

    @Test
    public void testCatchUrl() throws IOException {
        String invalidURL = "https://www.enterkomputer.com/404";
        String invalidOut = kategoriScrapper.scrapperWebsite(invalidURL);
        String expected = "Url 404 Not Found";
        assertEquals(invalidOut,expected);
    }
}
