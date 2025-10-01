package io.github.jakobschroll06;

import io.github.jakobschroll06.DNV_Info.passenger.Ford.FordModel;
import io.github.jakobschroll06.DNV_Info.passenger.Ford.Models;



public class Main {

    public static void simpleExample(int param) throws OhNo{
        // This has to be positive
        if (param < 0 ){
           //throw new IllegalArgumentException("Parameter has to be positive");
            throw new OhNo("Paramter cannot be negative" + param);
        }
        System.out.println("Everything worked fine");
    }

    public static void main(String[] args) {
        FordModel vehicle = new FordModel(
                "1FTFW1E50JFA12345",
                2018,
                Models.F150
        );
        //System.out.println(vehicle);
        try {
            simpleExample(-2);
        } catch (IllegalArgumentException | OhNo e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}