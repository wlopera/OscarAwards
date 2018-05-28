package com.wlopera.jee.service;

import java.util.List;

import javax.ejb.Local;

import com.wlopera.jee.domain.Oscar;

@Local
public interface OscarServiceLocal {	
	public List<Oscar> getOscars();

}
