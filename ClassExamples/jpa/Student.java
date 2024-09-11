package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String name;
	
	private int id;
	
	private String address;

}
