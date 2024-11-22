package ru.volkov.lesson3.homework;

public enum FlyStatus {

    FLY(true),
    NO_FLY(false);

    private boolean flyStatus;

    FlyStatus(boolean flyStatus){
        this.flyStatus = flyStatus;
    }

    public boolean getStatus(){
        return this.flyStatus;
    }

}
