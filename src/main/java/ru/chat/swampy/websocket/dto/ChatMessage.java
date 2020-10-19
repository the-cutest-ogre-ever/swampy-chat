package ru.chat.swampy.websocket.dto;

import lombok.Getter;
import lombok.Setter;
import ru.chat.swampy.websocket.util.StringUtils;

@Getter
@Setter
public class ChatMessage {

    private String from;
    private String text;
    private String recipient;
    private String time;

    public ChatMessage() {
    }

    public ChatMessage(String from, String text, String recipient) {
        this.from = from;
        this.text = text;
        this.recipient = recipient;
        this.time = StringUtils.getCurrentTimeStamp();
    }
}
