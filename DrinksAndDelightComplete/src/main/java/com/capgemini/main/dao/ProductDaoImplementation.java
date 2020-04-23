package com.capgemini.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.entites.RawSpecs;


@Transactional
@Repository
public class ProductDaoImplementation implements ProductDaoInterface{

	@PersistenceContext
	EntityManager entityManager;
	
	
	
	
	

	
	@Override
	public RawSpecs getProductSpecs(String rmsId) {
		return entityManager.find(RawSpecs.class,rmsId);
	}

	
	
	@Override
	public List<RawSpecs> reterive() {
		String Qstr="SELECT product from RawSpecs product";
		TypedQuery<RawSpecs> query=entityManager.createQuery(Qstr,RawSpecs.class);
		System.out.println("dao impl");
		return query.getResultList();
		}
	

}
