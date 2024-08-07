package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Product;
import com.example.model.ProductRequest;
import com.example.repository.ProductRepository;

public class ProductserviceImpl implements Productservice{

	@Override
	public Long addProduct(ProductRequest productreq) {
		Product product = Product.builder()
				          .productName(productreq.getProductName())
				          .price(productreq.getPrice())
				          .quantity(productreq.getQuantity())
				          .build();
		
		return null;
	}
	
	

}
