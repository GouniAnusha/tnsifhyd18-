package com.sriindu.demo.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sriindu.demo.project.entity.*;
import com.sriindu.demo.project.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService {
@Autowired
	PlacementRepository placementRepository;

@Override
public Placement savePlacement(Placement placement) {
	// TODO Auto-generated method stub
	return placementRepository.save(placement) ;
}

@Override
public List<Placement> fetchPlacementList() {
	// TODO Auto-generated method stub
	return placementRepository.findAll() ;
}

@Override
public Placement fetchPlacementById(Long placementId) {
	// TODO Auto-generated method stub
	return placementRepository.findById(placementId).get();
}

@Override
public void deletePlacementById(Long placementId) {
	// TODO Auto-generated method stub
	placementRepository.deleteById(placementId);
}

@Override
public Placement updatePlacement(Long placementId, Placement placement) {
	// TODO Auto-generated method stub
	Placement placementDB = placementRepository.findById(placementId).get();

    if(Objects.nonNull(placement.getPlacementName()) &&
    !"".equalsIgnoreCase(placement.getPlacementName())) {
    	placementDB.setPlacementName(placement.getPlacementName());
    }

    if(Objects.nonNull(placement.getPlacementQualification()) &&
            !"".equalsIgnoreCase(placement.getPlacementQualification())) {
    	placementDB.setPlacementQualification(placement.getPlacementQualification());
    }

    if(Objects.nonNull(placement.getPlacementYear()) &&
            !"".equals(placement.getPlacementYear())){
    	placementDB.setPlacementYear(placement.getPlacementYear());
    }

	return placementRepository.save(placementDB);
}



}
	

