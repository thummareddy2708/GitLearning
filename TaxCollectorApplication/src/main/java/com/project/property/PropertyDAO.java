package com.project.property;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.db.DbConnection;

public class PropertyDAO {
	
	  // Insert Property
    public boolean insertProperty(PropertyDetails p) {
        String sql = "INSERT INTO property (propertyid, basevalue, area, age, maincity) "
                   + "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getPropertyid());
            ps.setInt(2, p.getBasevalue());
            ps.setInt(3, p.getArea());
            ps.setInt(4, p.getAge());
            ps.setBoolean(5, p.isMaincity());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Retrieve all Properties
    public List<PropertyDetails> getAllProperties() {
        List<PropertyDetails> list = new ArrayList<>();
        String sql = "SELECT * FROM property";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                PropertyDetails p = new PropertyDetails(
                    rs.getInt("propertyid"),
                    rs.getInt("basevalue"),
                    rs.getInt("area"),
                    rs.getInt("age"),
                    rs.getBoolean("maincity")
                );
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Update Property
    public boolean updateProperty(PropertyDetails p) {
        String sql = "UPDATE property SET basevalue=?, area=?, age=?, maincity=? WHERE propertyid=?";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getBasevalue());
            ps.setInt(2, p.getArea());
            ps.setInt(3, p.getAge());
            ps.setBoolean(4, p.isMaincity());
            ps.setInt(5, p.getPropertyid());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
