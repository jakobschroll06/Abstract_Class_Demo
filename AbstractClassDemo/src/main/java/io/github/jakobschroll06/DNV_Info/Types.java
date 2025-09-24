package io.github.jakobschroll06.DNV_Info;

public enum Types {
    PASSENGER("Passenger"),
    MOTORCYCLE("Motorcycle"),
    BOAT("Boat"),
    TRAILER("Trailer");

    private final String displayName;

    Types(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
