package com.example.entitiies;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private  String messageId;
    @Column(name = "text_message")
    private String txtMessage;

    public String getMessageId() {
        return messageId;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public Message(){}

    public Message(String messageId, String txtMessage) {
        this.messageId = messageId;
        this.txtMessage = txtMessage;
    }
}
