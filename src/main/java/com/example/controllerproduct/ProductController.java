package com.example.controllerproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ProductRequest;
import com.example.service.Productservice;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private Productservice productservice;
	
	@PostMapping("/addproduct")
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productreq){
		Long productId = productservice.addProduct(productreq);
	    return new ResponseEntity<>(productId,HttpStatus.OK);
	}

}
