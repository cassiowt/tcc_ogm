package com.cawt.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    private String firstName;
    private String lastName;
    
    public Person() {
	}

    @OneToMany(mappedBy = "organizer", cascade = CascadeType.PERSIST)
    private Set<Hike> organizedHikes = new HashSet<>();

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public UUID getId() {
		return id;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Set<Hike> getOrganizedHikes() {
		return organizedHikes;
	}



	public void setOrganizedHikes(Set<Hike> organizedHikes) {
		this.organizedHikes = organizedHikes;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", organizedHikes=" + organizedHikes + "]";
	}
    
    
}
