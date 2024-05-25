package com.sriindu.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu.demo.project.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long>{

}
