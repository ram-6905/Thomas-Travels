package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {

		Driver driver1 = new Driver(1, "rajesh", "Auto", 98.13);
		Driver driver2 = new Driver(2, "shekar", "Car", 112.44);
		Driver driver3 = new Driver(3, "rajesh", "Auto", 74);
		Driver driver4 = new Driver(4, "mallikarjun", "Lorry", 113.93);
		Driver driver5 = new Driver(5, "beemla", "Car", 250.13);
		Driver driver6 = new Driver(6, "goverdhan", "Auto", 98.14);
		Driver driver7 = new Driver(7, "ram", "Auto", 98.93);
		Driver driver8 = new Driver(8, "aaravind", "Car", 532.73);
		Driver driver9 = new Driver(9, "sohel", "Lorry", 125.21);
		Driver driver10 = new Driver(10, "kumar", "Lorry", 92.67);

		ArrayList<Driver> drivers = new ArrayList<Driver>();
		drivers.add(driver1);
		drivers.add(driver2);
		drivers.add(driver3);
		drivers.add(driver4);
		drivers.add(driver5);
		drivers.add(driver6);
		drivers.add(driver7);
		drivers.add(driver8);
		drivers.add(driver9);
		drivers.add(driver10);

		Travel travel = new Travel();
		// Test isCarDriver method

		System.out.println("Is rajesh  a car driver? " + travel.isCarDriver(driver1));
		System.out.println("Is shekar  a car driver? " + travel.isCarDriver(driver2));
		System.out.println("Is rajesh  a car driver? " + travel.isCarDriver(driver3));
		System.out.println("Is mallikarjun  a car driver? " + travel.isCarDriver(driver4));
		System.out.println("Is beemla  a car driver? " + travel.isCarDriver(driver5));

		System.out.println();

		// Test retrieveByDriverId method
		System.out.println(travel.retrieveByDriverId(drivers, 1));
		System.out.println(travel.retrieveByDriverId(drivers, 5));

		System.out.println();

		// Test retrieveCountOfDriver method
		System.out.println("Number of Car drivers: " + travel.retrieveCountOfDriver(drivers, "Car"));
		System.out.println("Number of Lorry  drivers: " + travel.retrieveCountOfDriver(drivers, "Lorry"));
		System.out.println("Number of Auto  drivers: " + travel.retrieveCountOfDriver(drivers, "Auto"));

		System.out.println();

		// Test retrieveDriver method
		ArrayList<Driver> carDrivers = travel.retrieveDriver(drivers, "Car");
		System.out.println("List of Car drivers:");
		for (Driver d : carDrivers) {
			System.out.println("Driver ID: " + d.getDriverId() + ", Name: " + d.getDriverName());
		}
		System.out.println();
		ArrayList<Driver> lorryDrivers = travel.retrieveDriver(drivers, "Lorry");
		System.out.println("List of Lorry drivers:");
		for (Driver d : lorryDrivers) {
			System.out.println("Driver ID: " + d.getDriverId() + ", Name: " + d.getDriverName());
		}
		System.out.println();
		ArrayList<Driver> autoDrivers = travel.retrieveDriver(drivers, "Auto");
		System.out.println("List of auto drivers:");
		for (Driver d : autoDrivers) {
			System.out.println("Driver ID: " + d.getDriverId() + ", Name: " + d.getDriverName());
		}

		System.out.println();

		// Test retrieveMaximumDistanceTravelledDriver method
		Driver maxDistanceDriver = travel.retrieveMaximumDistanceTravelledDriver(drivers);
		System.out.println("Driver who travelled the maximum distance:");
		System.out.println("Driver ID: " + maxDistanceDriver.getDriverId() + ", Name: "
				+ maxDistanceDriver.getDriverName() + ", Distance: " + maxDistanceDriver.getTotalDistance() + " KM");

	}

}
