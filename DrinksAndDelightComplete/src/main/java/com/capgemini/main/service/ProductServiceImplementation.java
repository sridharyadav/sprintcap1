package com.capgemini.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.ProductDaoInterface;
import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.entites.RawSpecs;


@Service
@Transactional
public class ProductServiceImplementation implements ProductServiceInterface{

	@Autowired
	ProductDaoInterface daoObj;
	
	


	@Override
	public RawSpecs getProductSpecs(String rmsId) {
		return daoObj.getProductSpecs(rmsId);
	}

	@Override
	public OrderDetails findOrderById(String id) {
		return daoObj.findOrderById(id);
	}

	@Override
	public List<RawSpecs> retrieve() {
		System.out.println("--");
		return daoObj.reterive();
	}
	
	

}
