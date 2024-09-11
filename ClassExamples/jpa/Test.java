package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
	
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp = new Employee(100,"chandana",9387492,"usa");
		
		Employee emp1 = new Employee(101,"sushmitha",9683274,"usa");
		
		Employee emp2 = new Employee(102,"srinija",9732498,"usa");
		
		Employee emp3 = new Employee(103,"varun",92384792,"usa");
		
		
//		em.merge(emp);
//		
//		em.merge(emp1);
//		em.merge(emp2);em.merge(emp3);
		
		
		System.out.println(em.find(Employee.class,100));
		
		System.out.println(em.find(Employee.class,101));
		
		
//		Employee emp4 = (Employee)em.find(Employee.class, 102);
//		
//		Employee emp5 = (Employee)em.find(Employee.class, 103);
//		
//		em.remove(emp4);
//		
//		em.remove(emp5);
//		
		
		em.getTransaction().commit();
		
		em.close();
	
	}

}
