package io.github.jakobschroll06.DNV_Info.passenger;

import io.github.jakobschroll06.DNV_Info.Vehicle;
import io.github.jakobschroll06.DNV_Info.Types;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle(
            String vin,
            int manufactureYear,
            Makes make
    ) {
        super(
                vin,
                manufactureYear,
                Types.PASSENGER
        );
        this.make = make;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Make: ").append(make).append("\n");
        return sb.toString();
    }

    @Override
    protected int toString(int tabLevel, StringBuilder sb) {
        int newTabLevel = super.toString(tabLevel, sb);
        String tabs = "\t".repeat(newTabLevel);
        sb.append(tabs)
                .append("Make: ")
                .append(make)
                .append("\n");
        return newTabLevel+1;
    }
}
