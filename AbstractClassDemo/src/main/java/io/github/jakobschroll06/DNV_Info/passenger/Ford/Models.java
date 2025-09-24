package io.github.jakobschroll06.DNV_Info.passenger.Ford;

public enum Models
{
    F150("F-150"),
    MUSTANG("Mustang"),
    FOCUS("Focus"),
    ESCAPE("Escape");

    private final String displayName;

    Models(String displayName){
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
