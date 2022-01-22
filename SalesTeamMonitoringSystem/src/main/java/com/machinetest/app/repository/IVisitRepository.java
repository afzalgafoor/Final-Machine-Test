package com.machinetest.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.machinetest.app.model.Visit;

@Repository
public interface IVisitRepository extends CrudRepository<Visit, Integer> {

}
