package com.gl.ims.service;

import java.util.List;

import com.gl.ims.dto.ProductDto;
import com.gl.ims.entity.Product;

public interface ProductService {
	
	List<ProductDto> findAllProducts();
	
	void saveProduct(Product product);
	

}
