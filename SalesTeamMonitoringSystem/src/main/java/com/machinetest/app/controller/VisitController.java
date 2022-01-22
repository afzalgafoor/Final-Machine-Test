package com.machinetest.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.machinetest.app.model.Visit;
import com.machinetest.app.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VisitController {
	@Autowired
	private IVisitService visitService;
	
	@GetMapping("/visits")
	public List<Visit> getAllVisits() {
		return (List<Visit>) visitService.getAllVisits();
	}

	@GetMapping("/visits/{id}")
	public Optional<Visit> getVisitById(@PathVariable Integer id) {
		return visitService.getVisitById(id);
	}

	@PostMapping("/visits")
	public void addVisit(@RequestBody Visit visit) {
		visitService.addVisit(visit);

	}

	@PutMapping("/visits")
	public void updateEmployee(@RequestBody Visit visit) {
		visitService.updateVisit(visit);

	}

	@DeleteMapping("/visits/{id}")
	public void deleteVisit(@PathVariable Integer id) {
		visitService.deleteVisit(id);
	}


}
