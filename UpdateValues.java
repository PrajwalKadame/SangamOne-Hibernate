package Hibernareprogrms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateValues {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransection=entityManager.getTransaction();
	
	CreateTable createTable=new CreateTable();
	createTable.setStudent_id(1);
	createTable.setName("Pajju");
	createTable.setPhone(9731591691l);
	
	entityTransection.begin();
	entityManager.merge(createTable);
	entityTransection.commit();
	System.out.println("The datas are updated");
	
}
}
