package com.wlopera.jee.service;

import java.util.List;

import javax.ejb.Remote;

import com.wlopera.jee.domain.Oscar;

@Remote
public interface OscarServiceRemote {
	
	public List<Oscar> getOscars();

}
