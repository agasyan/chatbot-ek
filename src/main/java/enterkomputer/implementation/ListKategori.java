package enterkomputer.implementation;

import com.linecorp.bot.model.message.TextMessage;

public class ListKategori {
    private String listAllKategori = "Processor <processor>\n"
            + "Motherboard <motherboard>\n"
            + "Harddisk <harddisk>\n"
            + "SSD <ssd>\n"
            + "RAM:\n"
            + "PC RAM <memoryram>\n"
            + "Notebook RAM <memoryramnotebook>\n"
            + "VGA Card <vga>\n"
            + "Power Supply <psu>\n"
            + "Casing PC <casing>\n"
            + "LCD <lcd>\n"
            + "Optical Drive <optical>\n"
            + "Keyboard & Mouse <keyboard>\n"
            + "Software & OS <software>\n"
            + "Cooler & Fan  <coolerfan>\n"
            + "Flashdisk <flashdisk>\n"
            + "Memory Card<memorycard>\n"
            + "UPS & Stabilizer <ups>\n"
            + "Networking <networking>\n"
            + "Modem Portable (GSM & CDMA) <modem>\n"
            + "AIO PC & PC Branded <allinone>\n"
            + "Server <server>\n"
            + "NAS <nas>\n"
            + "Office <office>\n"
            + "Powerbank & Mobile Adaptor / Charger <powerbank>\n"
            + "Enclosure/Docking/Harddisk Case Protector <casinghdd>\n"
            + "Cable / Converter / KVM / Splitter <cable>\n"
            + "Thermal Pasta <thermalpasta>\n"
            + "Webcam <webcam>\n"
            + "USB HUB,Card Reader,PCI / USB Converter,Bluetooth Dongle <usbhub>\n"
            + "TV Tuner & TV Box & MP3 <tvtuner>\n"
            + "Gamepad, Steering, Presenter, Gaming Glasses <gamepad>\n"
            + "Function Panel & Front Panel Converter<functionpanel>"
            + "Neon CCFL <ccfl>\n"
            + "Speaker <speaker>\n"
            + "Headset <headset>\n"
            + "Sound Card <sound card>\n"
            + "Printer <printer>\n"
            + "Cartridge & Toner <cartridge>\n"
            + "Notebook & Ultrabook <notebook>\n"
            + "Notebook Cooler, Battery, Adaptor, Sparepart, Accessories <notebookacc>\n"
            + "Tablet Smartphone Tempered Glass & Acc <tempered>\n"
            + "Digital Drawing Tablet <drawing>\n"
            + "Media Player <mediaplayer>\n"
            + "Projector <projector>\n"
            + "Drone <drone>";

    public ListKategori() {

    }

    public TextMessage getListAllKategori() {
        listAllKategori = "Kategori yang ada di EnterKomputer adalah sebagai berikut"
                + " untuk menggunakan bot harap gunakan kata yang ada di dalam tanda '<~>':\n"
                + listAllKategori;
        return new TextMessage(listAllKategori);
    }
}
