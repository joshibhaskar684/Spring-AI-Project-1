package com.bhaskar.springAI_1.Controller;

import com.bhaskar.springAI_1.Service.ChatService;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.sax.SAXResult;

@RestController
@RequestMapping("/api/ai")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    @GetMapping("/chat")
    public String chat (@RequestParam String prompt ){
        return chatService.ask(prompt);
    }

}
