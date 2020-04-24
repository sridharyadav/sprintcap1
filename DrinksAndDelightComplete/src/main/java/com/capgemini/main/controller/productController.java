package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.main.entites.StockDetails;
import com.capgemini.main.service.ProductServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class productController {
	
	
	@Autowired
	ProductServiceInterface serviceObj;

	
	
	
	
	
	@GetMapping("/getProductSpecs/{id}")
	public ResponseEntity<StockDetails> getProductSpecs(@PathVariable String id)
	{
		StockDetails list = serviceObj.getProductSpecs(id);
		return new ResponseEntity<StockDetails>(list,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getAllProductSpecs")
    public ResponseEntity<List<StockDetails>> getProductList() {
			List<StockDetails> list = serviceObj.retrieve();
			
			return new ResponseEntity<List<StockDetails>>(list,HttpStatus.OK);
	}
	
	
	
	
}
