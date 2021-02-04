package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date data;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.data = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + data +
                "\n" + text;
    }
}
