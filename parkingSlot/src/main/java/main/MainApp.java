package main;

import service.VehicleService;
import service.ParkingSlotService;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehicleService vehicleService = new VehicleService();
        ParkingSlotService slotService = new ParkingSlotService();

        int choice;

        do {

            System.out.println("\n===== SMART PARKING SYSTEM =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Search Vehicle");
            System.out.println("6. Allocate Parking Slot");
            System.out.println("7. View Parking Slots");
            System.out.println("8. Exit Vehicle (Calculate Fee)");
            System.out.println("9. Exit Program");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();   // FIX: clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Vehicle Type: ");
                    String type = sc.nextLine();

                    vehicleService.addVehicle(number, name, type);
                    break;

                case 2:
                    vehicleService.viewVehicles();
                    break;

                case 3:
                    System.out.print("Enter Vehicle Number to Update: ");
                    String updateNum = sc.nextLine();

                    System.out.print("Enter New Owner Name: ");
                    String newName = sc.nextLine();

                    vehicleService.updateVehicle(updateNum, newName);
                    break;

                case 4:
                    System.out.print("Enter Vehicle Number to Delete: ");
                    String delNum = sc.nextLine();

                    vehicleService.deleteVehicle(delNum);
                    break;

                case 5:
                    System.out.print("Enter Vehicle Number to Search: ");
                    String searchNum = sc.nextLine();

                    vehicleService.searchVehicle(searchNum);
                    break;

                case 6:
                    System.out.print("Enter Slot Number: ");
                    int slot = sc.nextInt();
                    sc.nextLine();   // FIX buffer

                    System.out.print("Enter Vehicle Number: ");
                    String vnum = sc.nextLine();

                    System.out.print("Enter Entry Time: ");
                    String entry = sc.nextLine();

                    slotService.allocate(slot, vnum, entry);
                    break;

                case 7:
                    slotService.viewSlots();
                    break;

                case 8:
                    System.out.print("Enter Vehicle Number: ");
                    String exitVehicle = sc.nextLine();

                    slotService.exitVehicle(exitVehicle);
                    break;

                case 9:
                    System.out.println("Program Closed Successfully");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}