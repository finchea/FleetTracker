package com.fleettracker.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class AircraftDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aircraftId;
	private String status;
	private String tailNumber;
	private String reason;
	private String nextUpdate;
	private String remark;
	private boolean backInService;
	private int downTime;
	
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTailNumber() {
		return tailNumber;
	}
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getNextUpdate() {
		return nextUpdate;
	}
	public void setNextUpdate(String nextUpdate) {
		this.nextUpdate = nextUpdate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public boolean isBackInService() {
		return backInService;
	}
	public void setBackInService(boolean backInService) {
		this.backInService = backInService;
	}
	public int getDownTime() {
		return downTime;
	}
	public void setDownTime(int downTime) {
		this.downTime = downTime;
	}
	
	
	

}
