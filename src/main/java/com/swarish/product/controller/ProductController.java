package com.swarish.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swarish.product.entity.Product;
import com.swarish.product.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/Msg")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping(value="/allproducts")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}

	@GetMapping(value="/getproduct/{id}")
	public Product getAllProducts(@PathVariable long id){
		return productService.getProductById(id);
	}
	
	@PostMapping(value="/save")
    public List<Product> saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return productService.getAllProduct();

	}
	
	@DeleteMapping(value="/deleteproduct/{id}")
	public Product deleteProduct(@PathVariable long id) {
			return productService.deleteProductById(id);
	}

}
