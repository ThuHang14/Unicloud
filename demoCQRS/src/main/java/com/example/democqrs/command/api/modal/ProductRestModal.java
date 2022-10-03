package com.example.democqrs.command.api.modal;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRestModal {
private String name;
private BigDecimal price;
private Integer quantity;
}
