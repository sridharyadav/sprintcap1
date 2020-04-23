package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.entites.RawSpecs;
import com.capgemini.main.service.ProductServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class productController {
	
	
	@Autowired
	ProductServiceInterface serviceObj;

	
	
	
	
	
	@GetMapping("/getProductSpecs/{id}")
	public ResponseEntity<RawSpecs> getProductSpecs(@PathVariable String id)
	{
		RawSpecs list = serviceObj.getProductSpecs(id);
		return new ResponseEntity<RawSpecs>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getAllProductSpecs")
    public ResponseEntity<List<RawSpecs>> getProductList() {
			List<RawSpecs> list = serviceObj.retrieve();
			System.out.println("hi");
			return new ResponseEntity<List<RawSpecs>>(list,HttpStatus.OK);
	}
	
	
}
