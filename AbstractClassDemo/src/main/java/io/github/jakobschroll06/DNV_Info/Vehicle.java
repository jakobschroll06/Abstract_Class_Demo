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
    public  String getVin(){
        return vin;
    }

    public int getManufactureYear(){
        return  manufactureYear;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Info:\n");
        sb.append("\t").append("VIN: ").append(vin).append("\n");
        sb .append("\t").append("ManYear: ").append(manufactureYear).append("\n");
        return  sb.toString();
    }
}
