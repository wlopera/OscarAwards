package com.wlopera.jee.service;

import java.util.List;
import javax.ejb.Local;
import com.wlopera.jee.domain.Gender;

@Local
public interface GenderServiceLocal {	
	public List<Gender> getGenders();

}
