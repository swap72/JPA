package org.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAndBuildRelationship {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
		EntityTransaction txn=man.getTransaction();
		txn.begin();
		Student s=new Student();
		s.setAge(17);
		s.setGender('M');
		s.setName("Swapnil");
		
		IDCard c=new IDCard();
		c.setHouse("Blue");
		c.setNumber(9484135417l);
		s.setC(c);
		
		man.persist(c);
		man.persist(s);
		txn.commit();
	}	
}
