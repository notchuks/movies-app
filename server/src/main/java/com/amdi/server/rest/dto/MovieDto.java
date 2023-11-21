package com.amdi.server.rest.dto;

import org.bson.Document;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

public record MovieDto(String imdbId, String title, String director, String year, String poster,
                       List<CommentDto> comments, OffsetDateTime createdAt, OffsetDateTime updatedAt) {

    public record CommentDto(String username, String avatar, String text, LocalDateTime timestamp) {

    }
}
