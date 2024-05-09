package com.gl.ims.mapper;

import com.gl.ims.dto.ProductDto;
import com.gl.ims.entity.Product;

public class ProductMapper {

	// map Product entity to ProductDto
	public static ProductDto mapToProductDto(Product product) {

		ProductDto productDto = ProductDto.builder()
				.productName(product.getProductName())
				.id(product.getId())
				.productDescription(product.getProductDescription())
				.currentQuantity(product.getCurrentQuantity())
				.createdOn(product.getCreatedOn())
				.updatedOn(product.getUpdatedOn())
				.build();
		return productDto;

	}
	
	//map ProductDto to product
	
	 public static Product mapProductDtoToProduct(ProductDto productDto) {
		 
		 Product product = Product.builder()
				 .id(productDto.getId())
				 .productName(productDto.getProductName())
				 .productDescription(productDto.getProductDescription())
				 .currentQuantity(productDto.getCurrentQuantity())
				 .updatedOn(productDto.getUpdatedOn())
				 .createdOn(productDto.getCreatedOn())
				 .build();
		 
		 return product;
	 }
	
}
