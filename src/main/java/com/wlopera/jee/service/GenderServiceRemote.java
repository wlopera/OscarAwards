package com.wlopera.jee.service;

import java.util.List;

import javax.ejb.Remote;

import com.wlopera.jee.domain.Gender;

@Remote
public interface GenderServiceRemote {
	
	public List<Gender> getGenders();

}
