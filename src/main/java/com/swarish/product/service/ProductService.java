package com.swarish.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.swarish.product.entity.Product;

@Service
public class ProductService {
	
	
	private static final Product Products = null;
	public static List<Product> products = new ArrayList<Product>();

	public ProductService() {
	products.add(new Product(1,"A","PQR",1));
	products.add(new Product(2,"B","ABC",3));
	products.add(new Product(3,"C","XYZ",6));
	products.add(new Product(4,"D","LMO",10));
	}



	public List<Product> getAllProduct() {
	     return products;
	}
	
	public Product getProductById(long id) {
		Product productInfo = null;
		for(Product product : products) {
			if(product.getId()== id) {
				productInfo = product;
				break;
			}
		}
		return productInfo;
	}
	
	public boolean saveProduct(Product product) {
		boolean result = products.add(product);
		return result;

		}

   public boolean updateProductById(long id, Product updateProduct) {
	   boolean result = false;
	   for(int i=0; i< products.size();i++) {
			   Product product = products.get(i); 
		   if(product.getId()==id) {
			   products.set(i, updateProduct);
			   result = true;
			   break;
		   }
	   }
	return result;
   }



public Product deleteProductById(long id) {
	return Products;
}

	
}
