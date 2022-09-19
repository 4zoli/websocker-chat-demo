package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.messages.in.Message;
import com.example.messagingstompwebsocket.messages.out.WallResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class SendMessageController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/wall")
    public WallResponse greeting(Message message) {

        return new WallResponse(HtmlUtils.htmlEscape(message.getUserName()) + ": " + HtmlUtils.htmlEscape(message.getContent()));
    }
}
