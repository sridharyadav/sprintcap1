package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entites.RawSpecs;

public interface ProductServiceInterface {
	
	
	public RawSpecs getProductSpecs(String rmsId);
	
	public List<RawSpecs> retrieve();
}
