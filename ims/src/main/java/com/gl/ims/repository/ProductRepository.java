package com.gl.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ims.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
