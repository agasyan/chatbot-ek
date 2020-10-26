package advprog.enterkomputer.utilities;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import enterkomputer.utilities.BarangParser;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BarangScrapperTest {
    private BarangParser barangParser;

    @Before
    public void setUp() throws IOException {
        barangParser = new BarangParser("vga");
    }

    @Test
    public void testConstructor() {
        assertNotNull(barangParser);
    }

    @Test
    public void testFileNotFoundException() throws IOException {
        try {
            barangParser = new BarangParser("asasas");
        } catch (FileNotFoundException e) {
            Assert.fail();
        }
    }
}
