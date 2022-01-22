package com.machinetest.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.machinetest.app.model.Login;

@Repository
public interface ILoginRepository extends CrudRepository<Login, Integer>{

	
	@Query("FROM Login WHERE username=?1 AND password=?2")
	Login findByUsernameAndPassword(String username, String password);

}
