//package org.jpa;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//
//
//@Entity
//public class Student {
//	private String name;
//	@Id 
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	int age;	
//	
//	public Student(){
//		
//	}
//	@OneToOne
//	private IDCard c;
//	public IDCard getC() {
//		return c;
//	}
//
//	public void setC(IDCard c) {
//		this.c = c;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	
//}
