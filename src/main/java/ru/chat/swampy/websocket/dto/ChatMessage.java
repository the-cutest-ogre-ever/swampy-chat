package ru.chat.swampy.websocket.dto;

import ru.chat.swampy.websocket.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    private String from;
    private String text;
    private String recipient;
    private String time;

    public ChatMessage() {
        this.time = StringUtils.getCurrentTimeStamp();
    }

    public ChatMessage(String from, String text, String recipient) {
        this();
        this.from = from;
        this.text = text;
        this.recipient = recipient;
    }
}
