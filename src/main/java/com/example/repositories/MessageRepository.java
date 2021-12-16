package com.example.repositories;

import com.example.entitiies.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,String> {

}
