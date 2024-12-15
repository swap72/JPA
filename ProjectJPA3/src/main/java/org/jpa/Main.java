//package org.jpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Main{
//	public static void main(String[] args) {
//		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
//		EntityManager man=fac.createEntityManager();
//		EntityTransaction txn=man.getTransaction();
//		txn.begin();
//		Student s=new Student();
//		s.setAge(21);
//		s.setId(72);
//		s.setName("Swapnil");
//		man.merge(s);
//		txn.commit();
//	}
//}