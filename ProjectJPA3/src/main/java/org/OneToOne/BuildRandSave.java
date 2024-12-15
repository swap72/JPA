package org.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BuildRandSave {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
		EntityTransaction txn=man.getTransaction();
		txn.begin();
		Student s=new Student();
		s.setAge(21);		
		s.setName("Swapnil");

		
		IDCard c=new IDCard();
		s.setC(c);
		c.setHouse("Green");		
		c.setSection('B');
		
		man.persist(c);
		man.persist(s);

		
		txn.commit();
	}
}
