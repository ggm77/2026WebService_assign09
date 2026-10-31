package com.seohamin.week9.dto;

import java.time.Instant;

public record NoteResponse(
        Long id,
        String title,
        String content,
        String author,
        String category,
        String hashTag,
        Instant createdAt
) {
}
