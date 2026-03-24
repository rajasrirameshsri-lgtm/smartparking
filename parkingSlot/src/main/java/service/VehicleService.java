package service;

import dao.VehicleDAO;
import entity.Vehicle;

public class VehicleService {

    VehicleDAO dao = new VehicleDAO();

    // ADD VEHICLE
    public void addVehicle(String number, String name, String type) {

        Vehicle v = new Vehicle(number, name, type);
        dao.addVehicle(v);
    }

    // VIEW VEHICLES
    public void viewVehicles() {
        dao.viewVehicles();
    }

    // UPDATE VEHICLE
    public void updateVehicle(String number, String newName) {
        dao.updateVehicle(number, newName);
    }

    // DELETE VEHICLE
    public void deleteVehicle(String number) {
        dao.deleteVehicle(number);
    }

    // SEARCH VEHICLE
    public void searchVehicle(String number) {
        dao.searchVehicle(number);
    }
}