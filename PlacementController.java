package com.sriindu.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sriindu.demo.project.entity.Placement;
import com.sriindu.demo.project.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	PlacementService placementService;
	
	
	
	 @PostMapping("/placements")
	    public Placement savePlacement(@RequestBody Placement placement) {
	       
	        return placementService.savePlacement(placement);
	    }
	 @GetMapping("/placements")
	    public List<Placement> fetchPlacementList() {
	       
	        return placementService.fetchPlacementList();
	    }  
	   @GetMapping("/placements/{id}")
	    public Placement fetchPlacementById(@PathVariable("id") Long placementId)
	            {
	        return placementService.fetchPlacementById(placementId);
	    }
	   @DeleteMapping("/placements/{id}")
	    public String deletePlacementById(@PathVariable("id") Long placementId) {
	        placementService.deletePlacementById(placementId);
	        return "Placement deleted Successfully!!";
	    }
	   @PutMapping("/placements/{id}")
	    public Placement updatePlacement(@PathVariable("id") Long placementId,
	                                       @RequestBody Placement placement) {
	        return placementService.updatePlacement(placementId,placement);
	    }
	    

}
