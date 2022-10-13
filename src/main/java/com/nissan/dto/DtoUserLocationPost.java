package com.nissan.dto;

public class DtoUserLocationPost {
	//Fields
	
	private int userId;
	private String firstName;
	private String locationName;
	private String postDetails;
	
	public DtoUserLocationPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DtoUserLocationPost(int userId, String firstName, String locationName, String postDetails) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.locationName = locationName;
		this.postDetails = postDetails;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getPostDetails() {
		return postDetails;
	}

	public void setPostDetails(String postDetails) {
		this.postDetails = postDetails;
	}
	
}
