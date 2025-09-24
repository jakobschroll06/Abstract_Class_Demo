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
}
