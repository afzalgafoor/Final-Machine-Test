package com.machinetest.app.service;

import java.util.List;
import java.util.Optional;

import com.machinetest.app.model.Visit;

public interface IVisitService {
	
	public List<Visit> getAllVisits();

	public Optional<Visit> getVisitById(Integer id);

	public void addVisit(Visit role);

	public void updateVisit(Visit role);

	public void deleteVisit(Integer id);

}
