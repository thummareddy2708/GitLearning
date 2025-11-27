package com.project.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.db.DbConnection;

public class VehicleDAO {
	
	public boolean insertVehicle(VehicleTax v) {
		String sql="INSERT INTO vehicle (regno, brand, maxvelocity, capacity, purchasecost, vehicletype) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
		  try (Connection con = DbConnection.getConnection();
		             PreparedStatement ps = con.prepareStatement(sql)) {

		            ps.setString(1, v.getRegno());
		            ps.setString(2, v.getBrand());
		            ps.setInt(3, v.getMaxvelocity());
		            ps.setInt(4, v.getCapacity());
		            ps.setInt(5, v.getPurchasecost());
		            ps.setString(6, v.getType());

		            ps.executeUpdate();
		            return true;

		        } catch (Exception e) {
		            e.printStackTrace();
		            return false;
		        }
		    }
	
	 // Retrieve all vehicles
    public List<VehicleTax> getAllVehicles() {
        List<VehicleTax> list = new ArrayList<>();
        String sql = "SELECT * FROM vehicle";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                VehicleTax v = new VehicleTax(
                        rs.getString("regno"),
                        rs.getString("brand"),
                        rs.getInt("maxvelocity"),
                        rs.getInt("capacity"),
                        rs.getInt("purchasecost"),
                        rs.getString("vehicletype")
                );
                list.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    // Update Vehicle details
    public boolean updateVehicle(VehicleTax v) {
        String sql = "UPDATE vehicle SET brand=?, maxvelocity=?, capacity=?, purchasecost=?, vehicletype=? WHERE regno=?";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, v.getBrand());
            ps.setInt(2, v.getMaxvelocity());
            ps.setInt(3, v.getCapacity());
            ps.setInt(4, v.getPurchasecost());
            ps.setString(5, v.getType());
            ps.setString(6, v.getRegno());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

	}


