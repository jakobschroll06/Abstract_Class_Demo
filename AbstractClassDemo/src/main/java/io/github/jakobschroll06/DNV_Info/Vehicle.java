package io.github.jakobschroll06.DNV_Info;

public abstract class Vehicle {
    private final String vin;
    private final int manufactureYear;
    private final Types vehicleType;

    public Vehicle(String vin, int manufactureYear, Types vehicleType){
        this.vin = vin;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }
    public String getVin() {
        return vin;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public Types getVehicleType() {
        return vehicleType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Information:\n");
        sb.append("VIN: ").append(vin).append("\n");
        sb.append("Manufacture Year: ").append(manufactureYear).append("\n");
        sb.append(vehicleType);
        return sb.toString();
    }

    protected int toString(int tabLevel, StringBuilder sb) {
        String tabs = "\t".repeat(tabLevel);
        sb.append(tabs)
                .append("Vehicle Information:\n");
        String newTabs = "\t".repeat(tabLevel + 1);
        sb.append(newTabs)
                .append("VIN: ")
                .append(vin)
                .append("\n");
        sb.append(newTabs)
                .append("Manufacture Year: ")
                .append(manufactureYear)
                .append("\n");
        sb.append(vehicleType.toString(tabLevel + 1));
        return tabLevel + 1;
    }
}
