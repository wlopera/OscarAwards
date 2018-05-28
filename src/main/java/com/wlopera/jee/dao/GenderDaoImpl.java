package com.wlopera.jee.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.wlopera.jee.domain.Gender;

@Stateless
public class GenderDaoImpl implements GenderDao {
	
	@PersistenceContext(unitName = "GenderPU")
    EntityManager em;


	@SuppressWarnings("unchecked")
	@Override
	public List<Gender> getGenders() {
		return em.createNamedQuery("Gender.findAll").getResultList();
	}

}
