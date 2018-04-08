package com.learn.springboot.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learn.springboot.dao.LocalizedMessageDao;
import com.learn.springboot.dto.LocalizedMessage;

@Repository
@Transactional
public class LocalizedMessageDaoImpl implements LocalizedMessageDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public LocalizedMessageDaoImpl() {}

	@Override
	public void saveLocalizedMessages(LocalizedMessage lm) {
		System.out.println("Localized Message data is "+lm.toString());
		entityManager.persist(lm);
		System.out.println("Object Saved");
	}

	
}
