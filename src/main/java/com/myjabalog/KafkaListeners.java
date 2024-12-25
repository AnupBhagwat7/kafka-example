package com.myjabalog;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "myjavablog",
    groupId = "group-1")
    public void listen(String data){
        System.out.println("Listener received "+ data);
    }
}
