package entity;

public class ParkingSlot {

    private int slotId;
    private int slotNumber;
    private String vehicleNumber;
    private String status;
    private String entryTime;
    private String exitTime;
    private double amount;

    public ParkingSlot() {}

    public ParkingSlot(int slotNumber, String vehicleNumber, String status, String entryTime) {
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.status = status;
        this.entryTime = entryTime;
    }

    public int getSlotId() { return slotId; }
    public void setSlotId(int slotId) { this.slotId = slotId; }

    public int getSlotNumber() { return slotNumber; }
    public void setSlotNumber(int slotNumber) { this.slotNumber = slotNumber; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getEntryTime() { return entryTime; }
    public void setEntryTime(String entryTime) { this.entryTime = entryTime; }

    public String getExitTime() { return exitTime; }
    public void setExitTime(String exitTime) { this.exitTime = exitTime; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}