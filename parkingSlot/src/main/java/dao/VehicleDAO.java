package dao;

import util.DBUtil;
import entity.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VehicleDAO {

    // CREATE
    public void addVehicle(Vehicle v) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "insert into vehicle(vehicle_number,owner_name,vehicle_type) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, v.getVehicleNumber());
            ps.setString(2, v.getOwnerName());
            ps.setString(3, v.getVehicleType());

            ps.executeUpdate();

            System.out.println("Vehicle Added Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void viewVehicles() {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "select * from vehicle";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt(1) + "  " +
                        rs.getString(2) + "  " +
                        rs.getString(3) + "  " +
                        rs.getString(4));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateVehicle(String number, String name) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "update vehicle set owner_name=? where vehicle_number=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, number);

            ps.executeUpdate();

            System.out.println("Vehicle Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteVehicle(String number) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "delete from vehicle where vehicle_number=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, number);

            ps.executeUpdate();

            System.out.println("Vehicle Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // SEARCH FEATURE
    public void searchVehicle(String number) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "select * from vehicle where vehicle_number=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, number);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(rs.getInt(1) + "  " +
                        rs.getString(2) + "  " +
                        rs.getString(3) + "  " +
                        rs.getString(4));
            } else {
                System.out.println("Vehicle Not Found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}