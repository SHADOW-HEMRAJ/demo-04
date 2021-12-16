package com.example.services;

import com.example.entitiies.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MessageService {
    public ResponseEntity<Message> createMessage(Message message);
    public  ResponseEntity<List<Message>> findAllMessage();
    public ResponseEntity<Message> findMessageById(String messageId);
}
