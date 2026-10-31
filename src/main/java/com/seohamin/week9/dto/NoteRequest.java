package com.seohamin.week9.dto;

public record NoteRequest(
        String title,
        String content,
        String author,
        String category,
        String hashTag
) {
}
