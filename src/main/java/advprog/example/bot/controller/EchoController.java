package advprog.example.bot.controller;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

import enterkomputer.implementation.GetterBarang;
import enterkomputer.implementation.ListKategori;

import java.io.IOException;
import java.util.logging.Logger;

@LineMessageHandler
public class EchoController {

    private static final Logger LOGGER = Logger.getLogger(EchoController.class.getName());

    @EventMapping
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event)
            throws IOException {
        LOGGER.fine(String.format("TextMessageContent(timestamp='%s',content='%s')",
                event.getTimestamp(), event.getMessage()));
        TextMessageContent content = event.getMessage();
        String contentText = content.getText();

        String[] contentSplit = contentText.split(" ");
        if (contentSplit[0].equals("/echo")) {
            String replyText = contentText.replace("/echo", "");
            return new TextMessage(replyText.substring(1));
        } else if (contentSplit[0].equals("/enterkomputer")) {
            if (contentSplit[1].equals("listkategori")) {
                ListKategori listKategori = new ListKategori();
                return listKategori.getListAllKategoriApi();
            } else {
                String category = contentSplit[1];
                String name = contentText.replace("/enterkomputer " + category
                    + " ", "");
                GetterBarang getterBarang = new GetterBarang(category);
                return getterBarang.searchProduct(name);
            }
        } else {
            return new TextMessage("Wrong Command");
        }
    }

    @EventMapping
    public void handleDefaultMessage(Event event) {
        LOGGER.fine(String.format("Event(timestamp='%s',source='%s')",
                event.getTimestamp(), event.getSource()));
    }
}
