package io.github.jakobschroll06.DNV_Info.passenger.Ford;


import io.github.jakobschroll06.DNV_Info.passenger.Makes;
import io.github.jakobschroll06.DNV_Info.passenger.PassengerVehicle;

public class FordModel extends PassengerVehicle {

    private final Models model;

    public FordModel(
            String vin,
            int manufactureYear,
            Models model
    ) {
        super(
                vin,
                manufactureYear,
                Makes.FORD
        );
        this.model = model;
    }
    public Models getModel() {
        return model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString(0, sb));
        return sb.toString();
    }


    @Override
    protected int toString(int tabLevel, StringBuilder sb) {
        int newTabLevel = super.toString(tabLevel, sb);
        String tabs = "\t".repeat(newTabLevel);
        sb.append(tabs)
                .append("Model: ")
                .append(model)
                .append("\n");
        return newTabLevel;
    }
}