package com.bhaskar.springAI_1.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder openAiChatClientBuilder) {
        this.chatClient = openAiChatClientBuilder.build();
    }

    public String ask(String prompt) {
        return chatClient
                .prompt(prompt)
                .call()
                .content();
    }
}