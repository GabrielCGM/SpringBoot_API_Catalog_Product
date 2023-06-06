package com.catalog.product.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

public record ProductRecord(@NotBlank String name,
                            @NotBlank String brand,
                            @NotBlank String description,
                            Integer stock) implements Serializable {
    private static final long serialVersionUID = 1L;

}
