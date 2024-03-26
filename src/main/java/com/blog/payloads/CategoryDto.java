package com.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private int categoryId;

    @NotBlank
    @Size(min = 5, message = "Minimum size for title is 5")
    private String categoryTitle;

    @NotBlank
    @Size(min = 10, message = "Minimum size of category description is 10")
    private String categoryDescription;
}
