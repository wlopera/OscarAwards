package com.wlopera.jee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.wlopera.jee.dao.OscarDao;
import com.wlopera.jee.domain.Oscar;

@Stateless
public class OscarServiceImpl implements OscarServiceRemote, OscarServiceLocal {
	
	@EJB
    private OscarDao oscarDao;

	@Override
	public List<Oscar> getOscars() {
		return oscarDao.getOscars();
	}

}
