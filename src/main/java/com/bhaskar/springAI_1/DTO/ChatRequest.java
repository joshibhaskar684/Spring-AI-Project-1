package com.bhaskar.springAI_1.DTO;

import java.util.Map;

public record ChatRequest(
        String message,
        String userId,
        Map<String, Object> metadata
) {

}