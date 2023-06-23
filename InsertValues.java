package Hibernareprogrms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertValues {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransection=entityManager.getTransaction();
		CreateTable createTable=new CreateTable();
		createTable.setStudent_id(1);
		createTable.setName("Prajwal");
		createTable.setPhone(9731591691l);
		
		CreateTable createTable2=new CreateTable();
		createTable2.setStudent_id(2);
		createTable2.setName("Prashu");
		createTable2.setPhone(9731593691l);
		
		CreateTable createTable3=new CreateTable();
		createTable3.setStudent_id(3);
		createTable3.setName("Abhi");
		createTable3.setPhone(9331593691l);
		
		CreateTable createTable4=new CreateTable();
		createTable4.setStudent_id(4);
		createTable4.setName("Sudarshan");
		createTable4.setPhone(9331593681l);
		
		entityTransection.begin();
		entityManager.persist(createTable);
		entityManager.persist(createTable2);
		entityManager.persist(createTable3);
		entityManager.persist(createTable4);
		entityTransection.commit();
		System.out.println("The datas are inserted");
		
				
				
	}

}
