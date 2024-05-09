package com.gl.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gl.ims.dto.ProductDto;
import com.gl.ims.entity.Product;
import com.gl.ims.service.ProductService;

@Controller
public class ProductController {

	// inject service layer dependency
	ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	// mapping to fetch all the products in the database
	@GetMapping("/allProducts")
	public String products(Model model) {
		List<ProductDto> products = productService.findAllProducts();
		model.addAttribute("productAttribute", products);
		return "allProducts";
	}

	// get a product form to enter the details.
	@GetMapping("/product/new")
	public String createProductForm(Model model) {

		Product product = new Product();
		model.addAttribute("productAttribute", product);
		return "createProduct";
	}

	// save the product details
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("productAttribute") Product product) {
		productService.saveProduct(product);
		return "redirect:/allProducts";
	}
}
