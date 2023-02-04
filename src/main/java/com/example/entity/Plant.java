package com.example.entity;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "plant")
public class Plant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "scientificName")
	private String scientificName;

	@Column(name = "family")
	private String family;

	@Column(name = "createdAt")
	private Instant createdAt = Instant.now();

	public Plant() {
		this.createdAt = Instant.now();
	}

	public Plant(String name, String scientificName, String family) {
		this.name = name;
		this.scientificName = scientificName;
		this.family = family;
		this.createdAt = Instant.now();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Plant))
			return false;
		Plant plant = (Plant) o;
		return Objects.equals(id, plant.id) && Objects.equals(name, plant.name)
				&& Objects.equals(scientificName, plant.scientificName) && Objects.equals(family, plant.family)
				&& Objects.equals(createdAt, plant.createdAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, scientificName, family, createdAt);
	}

	@Override
	public String toString() {
		return "Plant{" + "id=" + id + ", name='" + name + '\'' + ", scientificName='" + scientificName + '\''
				+ ", family='" + family + '\'' + ", createdAt=" + createdAt + '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

}
