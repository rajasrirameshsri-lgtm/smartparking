package service;

import dao.ParkingSlotDAO;
import entity.ParkingSlot;

public class ParkingSlotService {

    ParkingSlotDAO dao = new ParkingSlotDAO();

    public void allocate(int slot, String vehicle, String time) {

        ParkingSlot p = new ParkingSlot(slot, vehicle, "ALLOCATED", time);
        dao.allocateSlot(p);
    }

    public void exitVehicle(String vehicle) {

        double amount = 50; // demo fee
        dao.exitVehicle(vehicle, "5PM", amount);
    }

    public void viewSlots() {
        dao.viewSlots();
    }
}