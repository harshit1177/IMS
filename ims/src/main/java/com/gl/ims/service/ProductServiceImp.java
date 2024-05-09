package com.gl.ims.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ims.dto.ProductDto;
import com.gl.ims.entity.Product;
import com.gl.ims.mapper.ProductMapper;
import com.gl.ims.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	//inject the repository dependency
	//constructor injection
	private ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImp( ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<ProductDto> findAllProducts() {
		List<Product>products = productRepository.findAll();
		
		//return products.stream().map((product)-> ProductMapper.mapToProductDto(product)).collect(Collectors.toList());
	    //we are coverting the list of products to productdto 	
		return products.stream().map(ProductMapper::mapToProductDto)
				.collect(Collectors.toList());
	}

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
		
	}
	
	
	
	

}
