package com.wlopera.jee.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.wlopera.jee.domain.Oscar;

@Stateless
public class OscarDaoImpl implements OscarDao {
	
	@PersistenceContext(unitName = "OscarPU")
    EntityManager em;


	@SuppressWarnings("unchecked")
	@Override
	public List<Oscar> getOscars() {
		return em.createNamedQuery("Oscar.findAll").getResultList();
	}

}
