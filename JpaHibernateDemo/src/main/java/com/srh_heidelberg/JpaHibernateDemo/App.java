package com.srh_heidelberg.JpaHibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		int CodeRunValue = 4; // 1 -> for select 2 -> for Insert 3 -> for Update 4 -> for Delete 

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("con");
		EntityManager em = emf.createEntityManager(); // Entity Manager requires Entity Manager Factory

		if (CodeRunValue == 1) {
			// Selecting column with id 1
			student stuSelect = em.find(student.class, 1);
			System.out.println(stuSelect);
		} else if (CodeRunValue == 2) {
			
			// For Adding value in database
			student stuInsert = new student();
			stuInsert.setStudent_Name("Moris Abon");
			stuInsert.setStudent_Address("Mannheim");
			stuInsert.setStudent_Contact("+49 7777777777");
			stuInsert.setIdclass(1);

			em.getTransaction().begin(); 	// need to begin the transaction before persist
			em.persist(stuInsert); 			// persist will save value in app memory
			em.getTransaction().commit();	// to save and reflect value into database.
			System.out.println(stuInsert);

		}else if(CodeRunValue == 3) {
			student stuUpdate = em.find(student.class, 3); 

			em.getTransaction().begin(); 			// need to begin the transaction before persist
			stuUpdate.setStudent_Name("Jhon Mora");
			stuUpdate.setIdclass(2);
			em.getTransaction().commit();			// to save and reflect value into database.
			System.out.println("Updated Successfully");
			
		}
		else if(CodeRunValue == 4) {
			student stuDelete = em.find(student.class, 4);

			em.getTransaction().begin(); 		// need to begin the transaction before persist
			em.remove(stuDelete); 				// persist will save value in app memory
			em.getTransaction().commit(); 		// to save and reflect value into database.
			System.out.println("Deleted Successfully");
			
		}else {
			System.out.println("Invalid Operation Selected");
			
		}

	}
}
