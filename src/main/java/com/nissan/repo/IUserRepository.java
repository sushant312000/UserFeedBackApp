package com.nissan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.dto.DtoUserLocationPost;
import com.nissan.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	//Custom JPQL Query, which is retrieving
	//userId, firstName, locationName, postDetails
	@Query("SELECT new com.nissan.dto.DtoUserLocationPost(u.userId,u.firstName,l.locationName,p.postDetails)"
			+ " FROM "
			+ "User u INNER JOIN u.userLocation l"
			+ " INNER JOIN u.posts p order by u.userId")
	List<DtoUserLocationPost> getAllUsersLocationAndPost();
}
