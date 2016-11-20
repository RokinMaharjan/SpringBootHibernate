package com.rokin.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.rokin.bookstore.entity.User;
import java.lang.String;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByUsername(String username);
}
