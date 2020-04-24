package com.capgemini.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.main.entites.StockDetails;


@Transactional
@Repository
public class ProductDaoImplementation implements ProductDaoInterface{

	@PersistenceContext
	EntityManager entityManager;
	
	
	
	
	

	
	@Override
	public StockDetails getProductSpecs(String stockId) {
		return entityManager.find(StockDetails.class,stockId);
	}

	
	
	@Override
	public List<StockDetails> reterive() {
		String Qstr=" from StockDetails";
		TypedQuery<StockDetails> query=entityManager.createQuery(Qstr,StockDetails.class);
		System.out.println("dao impl");
		return query.getResultList();
		}



	

}
