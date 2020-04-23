package com.capgemini.main.dao;

import java.util.List;


import com.capgemini.main.entites.RawSpecs;

public interface ProductDaoInterface {
	
	public RawSpecs getProductSpecs(String rmsId);
	
	public List<RawSpecs> reterive();
}
