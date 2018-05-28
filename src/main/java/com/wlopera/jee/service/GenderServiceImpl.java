package com.wlopera.jee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.wlopera.jee.dao.GenderDao;
import com.wlopera.jee.domain.Gender;

@Stateless
public class GenderServiceImpl implements GenderServiceRemote, GenderServiceLocal {
	
	@EJB
    private GenderDao genderDao;

	@Override
	public List<Gender> getGenders() {
		return genderDao.getGenders();
	}

}
