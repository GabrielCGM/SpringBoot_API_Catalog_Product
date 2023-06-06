package com.catalog.product.dtos;

import jakarta.validation.constraints.NotBlank;

public record ProductRecord(@NotBlank String name,
                            @NotBlank String brand,
                            @NotBlank String description,
                            @NotBlank Integer stock) {
}
