package com.github.diegopacheco.fixingmonoliths.contracts;

import java.math.BigDecimal;

public class SampleContract {

    public BigDecimal computeSalesTax(Long salesID,BigDecimal value,String state){
        return BigDecimal.valueOf(value.longValue() * 1.3);
    }

    public String GetDayOfTheWeek(int year,int month,int day){
        return "FRIDAY";
    }

    private void internalMethodHardToTest(){
        System.out.println("I do nothing!");
    }

    private void anotherMethodHardToTest(){
        System.out.println("I do nothing too!");
    }

}