package org.example.enums;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JUULY(30),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int daysMonth;

    private Month(int day){
        this.daysMonth=day;
    }
    public int getDaysMonth(){
        return  this.daysMonth;
    }
}
