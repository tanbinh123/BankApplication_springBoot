package com.quinnox.bankapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.bankapp.entites.Logins;
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	EntityManager manager;
	@Override
	@Transactional
	public boolean addLogins(Logins login) {
		manager.persist(login);
		return true;
	}
	
	@Override
	public List<Logins> getAllLogins() {
		TypedQuery<Logins> query = manager.createQuery("From Logins", Logins.class);
		return query.getResultList();
	}

}
