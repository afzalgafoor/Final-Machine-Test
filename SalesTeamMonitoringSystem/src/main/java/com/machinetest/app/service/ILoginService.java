package com.machinetest.app.service;

import java.util.List;
import java.util.Optional;

import com.machinetest.app.model.Login;

public interface ILoginService {
	
	
	public List<Login> getAllUsers();

	public Optional<Login> getUserById(Integer id);

	public void addUser(Login user);

	public void updateUser(Login user);

	public void deleteUser(Integer id);
	
	
	public Login getUserByUserNameAndPassword(String username,String password);



}
