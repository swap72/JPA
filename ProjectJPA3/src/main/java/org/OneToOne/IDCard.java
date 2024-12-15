package org.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IDCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String house;
	private long number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public IDCard(int id, String house, long number) {
		super();
		this.id = id;
		this.house = house;
		this.number = number;
	}
	public IDCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IDCard [id=" + id + ", house=" + house + ", number=" + number + "]";
	}
	
}
