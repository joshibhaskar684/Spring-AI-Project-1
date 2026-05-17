package com.bhaskar.springAI_1.DTO;

import java.time.Instant;

public record ChatResponse(
        String reply,
        String conversationId,
        Instant timestamp
) {}