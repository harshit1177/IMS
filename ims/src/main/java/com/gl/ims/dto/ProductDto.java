package com.gl.ims.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

	private Long id;

	private String productName;

	private String productDescription;

	private double currentQuantity;

	private LocalDateTime createdOn;

	private LocalDateTime updatedOn;

}
