package com.dataaccess;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.DbConfig;

public class Vehicle {
		private int vehid;
		private String vehname;
		private String color;
		private float fuelcap;
		private float avgspeed;
		
		private Connection con;
		
		public Vehicle() throws ClassNotFoundException, SQLException
		{
			con  = DbConfig.connectMySQL();
		}
		
		public Vehicle(int vehid, String vehname, String color, float fuelcap, float avgspeed) throws ClassNotFoundException, SQLException {
			this();
			this.vehid = vehid;
			this.vehname = vehname;
			this.color = color;
			this.fuelcap = fuelcap;
			this.avgspeed = avgspeed;
		}
		
		public void saveVehicleData() throws SQLException
		{
			//1. Create Connection.
			//private Connection con; as done on line 16
			//2. Write Query.
			String  query = "INSERT INTO Vehicle(vehid,vehname,color,fuelcap,avgspeed) VALUE ("+vehid+",'"+vehname+"','"+color+"',"+fuelcap+","+avgspeed+")";
			//3. Create "Statement" Interface Object
			Statement stmt = con.createStatement();
			//the Statement is a interface and it is used to sending a SQL query to the database 
			//4. Execute Query.
			stmt.execute(query);
		}
		
		public void updateVehicleData() throws SQLException
		{
			String  query = "UPDATE Vehicle SET vehname = '"+vehname+"', color='"+color+"', fuelcap="+fuelcap+"; avgspeed="+avgspeed+" WHERE vehid="+vehid+"";
			Statement stmt = con.createStatement();
			stmt.execute(query);
		}
		
		public void deleteVehicleData() throws SQLException
		{
			String  query = "DELETE FROM Vehicle WHERE vehid = "+this.vehid;
			Statement stmt = con.createStatement();
			stmt.execute(query);
		}
}
