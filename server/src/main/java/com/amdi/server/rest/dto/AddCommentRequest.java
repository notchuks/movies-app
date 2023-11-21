package com.amdi.server.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddCommentRequest {

    @Schema(example = "Very Good!")
    @NotBlank
    private String text;
}
