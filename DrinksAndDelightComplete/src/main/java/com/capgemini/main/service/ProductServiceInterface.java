package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entites.StockDetails;

public interface ProductServiceInterface {
	
	
	public StockDetails getProductSpecs(String stockId);

	
	public List<StockDetails> retrieve();
	
}
