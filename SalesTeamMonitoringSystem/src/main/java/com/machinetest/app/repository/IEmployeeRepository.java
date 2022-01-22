package com.machinetest.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.machinetest.app.model.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
