package advprog.example.bot.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import advprog.example.bot.EventTestUtil;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(properties = "line.bot.handler.enabled=false")
@ExtendWith(SpringExtension.class)
public class EchoControllerTest {

    static {
        System.setProperty("line.bot.channelSecret", "SECRET");
        System.setProperty("line.bot.channelToken", "TOKEN");
    }

    @Autowired
    private EchoController echoController;

    @Test
    void testContextLoads() {
        assertNotNull(echoController);
    }

    @Test
    void testHandleTextMessageEvent() {
        MessageEvent<TextMessageContent> event =
                EventTestUtil.createDummyTextMessage("/echo Lorem Ipsum");

        TextMessage reply = echoController.handleTextMessageEvent(event);

        assertEquals("Lorem Ipsum", reply.getText());
    }

    @Test
    void testHandleDefaultMessage() {
        Event event = mock(Event.class);

        echoController.handleDefaultMessage(event);

        verify(event, atLeastOnce()).getSource();
        verify(event, atLeastOnce()).getTimestamp();
    }

    @Test
    void testKategoriEnterKomputer() {
        MessageEvent<TextMessageContent> event =
                EventTestUtil.createDummyTextMessage("/enterkomputer listkategori");
        TextMessage reply = echoController.handleTextMessageEvent(event);
        String expectedOut = "Kategori yang ada di EnterKomputer adalah sebagai berikut"
                + " untuk menggunakan bot harap gunakan kata yang ada di dalam tanda '<~>':\n"
                + "Accessories <accessories>\n"
                + "AIO PC & PC Branded <allinone>\n"
                + "Best Seller <best_seller>\n"
                + "Casing PC <casing>\n"
                + "Cooler & Fan  <coolerfan>\n"
                + "Digital Drawing Tablet <drawing>\n"
                + "Drone <drone>\n"
                + "Flashdisk <flashdisk>\n"
                + "Gadget <gadget>\n"
                + "Harddisk <harddisk>\n"
                + "Keyboard & Mouse <keyboard>\n"
                + "LCD <lcd>\n"
                + "Memory Card <memorycard>\n"
                + "Motherboard <motherboard>\n"
                + "Networking <networking>\n"
                + "Notebook & Ultrabook <notebook>\n"
                + "Optical Drive <optical>\n"
                + "Printer <printer>\n"
                + "Processor <processor>\n"
                + "Projector <projector>\n"
                + "Power Supply <psu>\n"
                + "Server <server>\n"
                + "Software & OS <software>\n"
                + "Sound Card <sound card>\n"
                + "Speaker <speaker>\n"
                + "SSD <ssd>\n"
                + "UPS & Stabilizer <ups>\n"
                + "VGA Card <vga>\n";
        assertEquals(reply.getText(),expectedOut);
    }
}