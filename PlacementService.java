package com.sriindu.demo.project.service;

import java.util.List;

import com.sriindu.demo.project.entity.Placement;

public interface PlacementService {

	public Placement savePlacement(Placement placement);

public	List<Placement> fetchPlacementList();



public void deletePlacementById(Long placementId);

public Placement updatePlacement(Long placementId, Placement placement);

public Placement fetchPlacementById(Long placementId);


	

	



	

	  

	
	 

}
