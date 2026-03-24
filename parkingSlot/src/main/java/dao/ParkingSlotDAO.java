package dao;

import util.DBUtil;
import entity.ParkingSlot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParkingSlotDAO {

    // CREATE
    public void allocateSlot(ParkingSlot p) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "insert into parking_slot(slot_number,vehicle_number,status,entry_time) values(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getSlotNumber());
            ps.setString(2, p.getVehicleNumber());
            ps.setString(3, p.getStatus());
            ps.setString(4, p.getEntryTime());

            ps.executeUpdate();

            System.out.println("Slot Allocated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void viewSlots() {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "select * from parking_slot";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt(1) + "  " +
                        rs.getInt(2) + "  " +
                        rs.getString(3) + "  " +
                        rs.getString(4) + "  " +
                        rs.getString(5));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE (Exit Vehicle + Amount)
    public void exitVehicle(String vehicle, String exitTime, double amount) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "update parking_slot set exit_time=?, amount=?, status='FREE' where vehicle_number=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, exitTime);
            ps.setDouble(2, amount);
            ps.setString(3, vehicle);

            ps.executeUpdate();

            System.out.println("Vehicle Exit Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteSlot(int slotId) {

        try {
            Connection con = DBUtil.getConnection();

            String sql = "delete from parking_slot where slot_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, slotId);

            ps.executeUpdate();

            System.out.println("Slot Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}