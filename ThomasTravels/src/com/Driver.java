package com;

public class Driver {
	private int driverId;
	private double totalDistance;
	private String driverName;
	private String category;
	
	public Driver() {
		
	}
	public Driver( int driverId, String driverName, String category,double totalDistance ) {
		this.driverId = driverId;
		this.totalDistance = totalDistance;
		this.driverName = driverName;
		this.category = category;

	}

	public void setDriverId(int DriverId) {
		this.driverId = DriverId;

	}

	public int getDriverId() {
		return driverId;
	}

	public void setTotalDistance(Double totalDistance) {
		this.totalDistance = totalDistance;

	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;

	}

	public String getDriverName() {
		return driverName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

}