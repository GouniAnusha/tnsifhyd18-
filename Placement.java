package com.sriindu.demo.project.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
      private Long placementId;
      private String placementName;
      private String placementQualification;
      private int placementYear;
      
      
	public Placement() {
		super();
	}


	public Placement(Long placementId, String placementName, String placementQualification, int placementYear) {
		super();
		this.placementId = placementId;
		this.placementName = placementName;
		this.placementQualification = placementQualification;
		this.placementYear = placementYear;
	}


	public Long getPlacementId() {
		return placementId;
	}


	public void setPlacementId(Long placementId) {
		this.placementId = placementId;
	}


	public String getPlacementName() {
		return placementName;
	}


	public void setPlacementName(String placementName) {
		this.placementName = placementName;
	}


	public String getPlacementQualification() {
		return placementQualification;
	}


	public void setPlacementQualification(String placementQualification) {
		this.placementQualification = placementQualification;
	}


	public int getPlacementYear() {
		return placementYear;
	}


	public void setPlacementYear(int placementYear) {
		this.placementYear = placementYear;
	}


	@Override
	public String toString() {
		return "Placement [placementId=" + placementId + ", placementName=" + placementName
				+ ", placementQualification=" + placementQualification + ", placementYear=" + placementYear + "]";
	}


	
	
	
}
