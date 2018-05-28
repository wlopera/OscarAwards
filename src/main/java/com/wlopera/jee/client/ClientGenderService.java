package com.wlopera.jee.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.wlopera.jee.domain.Gender;
import com.wlopera.jee.domain.Oscar;
import com.wlopera.jee.service.GenderServiceRemote;
import com.wlopera.jee.service.OscarServiceRemote;

public class ClientGenderService {

	public static void main(String[] args) {
		System.out.println("##=> Iniciando llamada al EJB desde el cliente\n");
		try {

			Context jndi = new InitialContext();

			GenderServiceRemote genderService = (GenderServiceRemote) jndi
					.lookup("java:global/OscarAwards/GenderServiceImpl!com.wlopera.jee.service.GenderServiceRemote");

			List<Gender> genders = genderService.getGenders();
			for (Gender gender : genders) {
				System.out.println(gender);
			}
			
			OscarServiceRemote oscarService = (OscarServiceRemote) jndi
					.lookup("java:global/OscarAwards/OscarServiceImpl!com.wlopera.jee.service.OscarServiceRemote");

			List<Oscar> oscars = oscarService.getOscars();
			for (Oscar oscar : oscars) {
				System.out.println(oscar);
			}

			System.out.println("\n##=> Fin llamada al EJB desde el cliente");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
