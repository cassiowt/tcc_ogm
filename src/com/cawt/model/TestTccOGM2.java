package com.cawt.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestTccOGM2 {

	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {

		entityManagerFactory = Persistence.createEntityManagerFactory("tcc_ogm");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		// create a Person
		Person bob = new Person("Bob", "McRobb");

		// and two hikes
		Hike cornwall = new Hike("Visiting Land's End", new Date(), new BigDecimal("5.5"), new HikeSection("Penzance", "Mousehole"),
				new HikeSection("Mousehole", "St. Levan"), new HikeSection("St. Levan", "Land's End"));
		Hike isleOfWight = new Hike("Exploring Carisbrooke Castle", new Date(), new BigDecimal("7.5"), new HikeSection("Freshwater", "Calbourne"),
				new HikeSection("Calbourne", "Carisbrooke Castle"));

		// let Bob organize the two hikes
		cornwall.setOrganizer(bob);
		bob.getOrganizedHikes().add(cornwall);

		isleOfWight.setOrganizer(bob);
		bob.getOrganizedHikes().add(isleOfWight);

		// persist organizer (will be cascaded to hikes)
		entityManager.persist(bob);

		entityManager.getTransaction().commit();

		// get a new EM to make sure data is actually retrieved from the store
		// and not Hibernate's internal cache
		entityManager.close();
		entityManager = entityManagerFactory.createEntityManager();

		// load it back
		entityManager.getTransaction().begin();

		Person loadedPerson = entityManager.find(Person.class, bob.getId());

		
		
		entityManager.getTransaction().commit();

		entityManager.close();

		entityManagerFactory.close();
	}

}
