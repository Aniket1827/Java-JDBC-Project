package com.app;

import java.sql.SQLException;

import com.dataaccess.Vehicle;

public class MainClass {
			public static void main(String[] args)
			{
				try
				{
					//Vehicle v1 =new Vehicle(3,"Ferrari","Red",40.00f,200.00f);
					//v1.saveVehicleData();
					Vehicle v2 = new Vehicle(4,"Jaguar","White",50.00f,400.00f);
					//v2.saveVehicleData();
					v2.deleteVehicleData();
					System.out.println("-----------------");
				} 
				catch (ClassNotFoundException | SQLException e) 
				{
					e.printStackTrace();
				}
			}
}
