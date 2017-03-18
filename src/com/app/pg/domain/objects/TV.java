package com.app.pg.domain.objects;

import java.util.Date;

public class TV {

	// Used to define is tv working

	private boolean tvworking;

	// Used to define tvstate i.e On or Off

	private String tvState;
	
	//used to define createDate
	
	 private Date createdOn;
			
	//used to define createdBy
	 
	private String createdBy;
			
	//used to define updatedon
	
	private Date updatedOn;
			
	//used to define updatedBy
	
	private Date updatedBy;
			

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	public boolean isTvworking() {
		return tvworking;
	}

	public void setTvworking(boolean tvworking) {
		this.tvworking = tvworking;
	}

	public String getTvState() {
		return tvState;
	}

	public void setTvState(String tvState) {
		this.tvState = tvState;
	}

}
