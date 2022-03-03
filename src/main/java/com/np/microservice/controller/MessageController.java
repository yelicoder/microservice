package com.np.microservice.controller;

import com.np.microservice.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @ResponseBody
    @GetMapping("/message")
    Message send() {
        return new Message("first message");
    }

    @ResponseBody
    @PostMapping("/message")
    Message echo (@RequestBody Message message) {
        return message;
    }
}
