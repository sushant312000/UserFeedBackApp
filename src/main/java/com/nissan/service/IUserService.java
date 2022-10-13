package com.nissan.service;

import java.util.List;

import com.nissan.dto.DtoUserLocationPost;
import com.nissan.model.User;

public interface IUserService {
	List<User> getAllUsers();
	
	List<DtoUserLocationPost> getAlluserLocationAndPostsDto();
}
