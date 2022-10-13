package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tblPost")
public class Post {
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	
	@Column(nullable = false)
	private String postDetails;
	
	@JoinColumn(name="userId", insertable=false, updatable=false)
	@ManyToOne
	private User userPosts;

	//Default constructor
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Post(int postId, String postDetails, User userPosts) {
		super();
		this.postId = postId;
		this.postDetails = postDetails;
		this.userPosts = userPosts;
	}

	//Getters and setters
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostDetails() {
		return postDetails;
	}

	public void setPostDetails(String postDetails) {
		this.postDetails = postDetails;
	}

	@JsonBackReference
	public User getUserPosts() {
		return userPosts;
	}

	public void setUserPosts(User userPosts) {
		this.userPosts = userPosts;
	}
	
}
