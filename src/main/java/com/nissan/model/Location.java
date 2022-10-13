package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tblLocation")
public class Location {
	//Fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationId;
	
	@Column(nullable = false)
	private String locationName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "userLocation", cascade = CascadeType.ALL)
	private List<User> users;

	//Default constructor
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Location(int locationId, String locationName, List<User> users) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.users = users;
	}

	//Getters and setters
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@JsonManagedReference
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	//Override toString
	@Override
	public String toString() {
		return String.format("Location [locationId=%s, locationName=%s, users=%s]", locationId, locationName, users);
	}

}
