package com.machinetest.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.app.model.Visit;
import com.machinetest.app.repository.IVisitRepository;

import com.machinetest.app.model.Visit;

@Service
public class VisitServiceImplementation implements IVisitService {

	@Autowired
	private IVisitRepository visitRepository;
	
	@Override
	public List<Visit> getAllVisits() {
		return (List<Visit>) visitRepository.findAll();
	}

	@Override
	public Optional<Visit> getVisitById(Integer id) {
		return visitRepository.findById(id);
	}

	@Override
	public void addVisit(Visit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void updateVisit(Visit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void deleteVisit(Integer id) {
		visitRepository.deleteById(id);

	}


}
