package advprog.enterkomputer.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.linecorp.bot.model.message.TextMessage;

import enterkomputer.implementation.GetterBarang;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GetterBarangTest {
    private GetterBarang getterBarang;

    @Test
    public void testConstructorWork() throws IOException {
        getterBarang = new GetterBarang("vga");
        assertNotNull(getterBarang);
    }

    @Test
    public void testWrongCategory() throws IOException {
        getterBarang = new GetterBarang("nocategory");
        String exp = "Kategori Is not Exist";
        TextMessage out = getterBarang.searchProduct("namae");
        assertEquals(out.getText(),exp);
    }

    @Test
    public void testCategoryExistsNoBarang() throws IOException {
        getterBarang = new GetterBarang("vga");
        String exp = "No product listed with that name";
        TextMessage out = getterBarang.searchProduct("jacoco");
        assertEquals(out.getText(),exp);
    }

    @Test
    public void testBarangExists() throws IOException {
        getterBarang = new GetterBarang("vga");
        String exp = "Zotac GeForce GTX 1080 Ti 11GB DDR5X AMP EXTREME "
                + "Core Edition - vga - 13385000\n"
                + "Zotac GeForce GTX 1080 Ti 11GB DDR5X AMP Edition"
                + " - vga - 12665000\n"
                + "Zotac GeForce GTX 1080 Ti 11GB DDR5X Mini"
                + " - vga - 12085000\n"
                + "Zotac GeForce GTX 1080 8GB DDR5 AMP EXTREME"
                + " - vga - 9920000\n"
                + "Zotac GeForce GTX 1080 8GB DDR5 AMP Edition"
                + " - vga - 9480000\n"
                + "Zotac GeForce GTX 1080 8GB DDR5 Dual Fan"
                + " - vga - 9050000\n"
                + "MSI GeForce GTX 1080 Ti 11GB DDR5X"
                + " - Gaming X Trio - vga - 16345000\n"
                + "MSI GeForce GTX 1080 Ti 11GB DDR5X"
                + " - Gaming X - vga - 15850000\n"
                + "MSI GeForce GTX 1080 8GB DDR5X"
                + " - Gaming X - vga - 10700000\n"
                + "Manli GeForce GTX 1080 Ti 11GB DDR5X"
                + " - Gallardo OC - vga - 12050000\n"
                + "Inno 3D GeForce GTX 1080 8GB DDR5 Gaming OC"
                + " - vga - 8200000\n"
                + "Inno 3D GeForce GTX 1080 8GB DDR5 ICHILL X4"
                + " - vga - 9730000\n"
                + "Inno 3D Geforce GTX 1080 Ti 11GB DDR5X"
                + " - Twin X2 - vga - 13100000\n"
                + "Inno 3D Geforce GTX 1080 Ti 11GB DDR5X"
                + " - ICHILL  X4 - vga - 13600000\n"
                + "Inno 3D Geforce GTX 1080 Ti 11GB DDR5X"
                + " - ICHILL ULTRA X4 - vga - 14000000\n"
                + "Gigabyte GeForce GTX 1080 8GB DDR5 G1 Gaming"
                + " - GV-N1080G1 Gaming-8GD - vga - 11930000\n"
                + "Gigabyte GeForce GTX 1080 8GB DDR5 AORUS"
                + " - GV-N1080AORUS-8GD - vga - 11335000\n"
                + "Gigabyte GeForce GTX 1080 Ti 11GB DDR5X Gaming"
                + " OC GV-N108TGAMING OC 11GD - vga - 16430000\n"
                + "Gigabyte GeForce GTX 1080 Ti 11GB DDR5 AORUS"
                + " GV-N108TAORUS-11GD - vga - 17240000\n"
                + "Gigabyte GeForce GTX 1080 Ti 11GB DDR5X  AORUS"
                + "  Xtreme Edition GV-N108TAORUS-X-11GD - vga - 17550000\n"
                + "Gigabyte GeForce GTX 1080 Ti 11GB DDR5X Waterforce"
                + " WB Xtreme Edition - GV-N108TAORUSX WB-11GD - vga - 19030000\n"
                + "Digital Alliance GeForce GTX 1080 Ti 11GB DDR5 GameRock Premium"
                + " - vga - 14350000\n"
                + "Digital Alliance GeForce GTX 1080 Ti 11GB DDR5 GameRock"
                + " - vga - 13375000\n"
                + "Digital Alliance GeForce GTX 1080 Ti 11GB DDR5 352bit "
                + "Super Jetstream - vga - 13700000\n"
                + "Digital Alliance GeForce GTX 1080 8GB DDR5 Dual OC"
                + " - vga - 9230000\n"
                + "iGame nVidia Geforce GTX 1080 8GB DDR5X"
                + " - X-TOP-8G - Triple Fan ( Garansi 3 Bln ) - vga - 9900000\n"
                + "Asus GeForce GTX 1080 8GB DDR5 - Turbo - vga - 8450000";
        TextMessage out = getterBarang.searchProduct("gtx 1080");
        assertEquals(out.getText(),exp);
    }
}
