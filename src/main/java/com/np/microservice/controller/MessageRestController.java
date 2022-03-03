package com.np.microservice.controller;

import com.np.microservice.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @GetMapping("/messageRest")
    Message send() {
        return new Message("first rest controller message");
    }

    @PostMapping("/messageRest")
    Message echo (@RequestBody Message message) {
        return message;
    }
}
