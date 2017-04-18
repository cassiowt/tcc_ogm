package com.cawt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Hike {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String description;
	private Date date;
	private BigDecimal difficulty;

	@ManyToOne
	private Person organizer;

	@ElementCollection
	@OrderColumn(name = "sectionNo")
	private List<HikeSection> sections;

	public Hike() {
		sections = new ArrayList<>();
	}

	public Hike(String description, Date date, BigDecimal difficulty, HikeSection hikeSection, HikeSection hikeSection2, HikeSection hikeSection3) {
		sections = new ArrayList<>();
		this.description = description;
		this.date = date;
		this.difficulty = difficulty;
		this.sections.add(hikeSection);
		this.sections.add(hikeSection2);
		this.sections.add(hikeSection3);
	}
	public Hike(String description, Date date, BigDecimal difficulty, HikeSection hikeSection, HikeSection hikeSection2) {
		sections = new ArrayList<>();
		this.description = description;
		this.date = date;
		this.difficulty = difficulty;
		this.sections.add(hikeSection);
		this.sections.add(hikeSection2);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	}

	public Person getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Person organizer) {
		this.organizer = organizer;
	}

	public List<HikeSection> getSections() {
		return sections;
	}

	public void setSections(List<HikeSection> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Hike [id=" + id + ", description=" + description + ", date=" + date + ", difficulty=" + difficulty + ", organizer=" + organizer
				+ ", sections=" + sections + "]";
	}

}
