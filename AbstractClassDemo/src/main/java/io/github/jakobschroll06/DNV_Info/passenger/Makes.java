package io.github.jakobschroll06.DNV_Info.passenger;

public enum Makes {
    FORD("FORD"),
    TOYOTA("Toyota");

    private final String displayName;

    Makes(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    @Override
    public String toString(){
        return displayName;
    }


}
