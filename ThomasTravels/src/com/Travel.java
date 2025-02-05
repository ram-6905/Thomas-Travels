package com;

import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver driver) {
		return "Car".equalsIgnoreCase(driver.getCategory());
	}

	public String retrieveByDriverId(ArrayList<Driver> drivers, int driverId) {
		for (Driver driver : drivers) {
			if (driver.getDriverId() == driverId) {
				return "Driver name is " + driver.getDriverName() + " belonging to the category " + driver.getCategory()
						+ " traveled " + driver.getTotalDistance() + " KM so far.";
			}
		}
		return "Driver not found.";
	}

	public int retrieveCountOfDriver(ArrayList<Driver> drivers, String category) {
		int count = 0;
		for (Driver driver : drivers) {
			if (category.equalsIgnoreCase(driver.getCategory())) {
				count++;
			}
		}
		return count;
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> drivers, String category) {
		ArrayList<Driver> categoryDrivers = new ArrayList<>();
		for (Driver driver : drivers) {
			if (category.equalsIgnoreCase(driver.getCategory())) {
				categoryDrivers.add(driver);
			}
		}
		return categoryDrivers;
	}

	public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		Driver maxDistanceDriver = null;
		double maxDistance = 0;
		for (Driver driver : drivers) {
			if (driver.getTotalDistance() > maxDistance) {
				maxDistance = driver.getTotalDistance();
				maxDistanceDriver = driver;
			}
		}
		return maxDistanceDriver;
	}

}
