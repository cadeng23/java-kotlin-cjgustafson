package com.example.goshdarn;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoshDarnUnitTest {

    @Test public void getTotalCrap() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        assertEquals(Crap, instance.getTotalCrap(),0.0);
    }

    @Test public void haveBillsTrue() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        assertEquals(true, instance.haveBills());
    }

    @Test public void haveBillsFalse() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        assertEquals(false, instance.haveBills());
    }

    @Test public void MonthlyBillsAmount(){
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        double MonthlyBills = 1000.0;
        assertEquals(MonthlyBills, instance.MonthlyBillsAmount(), 1000.0);
    }

    @Test public void MoneyInBankCurrently(){
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        double MoneyInBank = 100.0;
        assertEquals(MoneyInBank, instance.MoneyInBankCurrently(),0.0);

    }

    @Test public void setCrapLevel() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        assertEquals(120.5, instance.getTotalCrap(), 120.5);
        double newCrapLevel = 250.5;
        instance.setCrapLevel(newCrapLevel);
        assertEquals(newCrapLevel, instance.getTotalCrap(),0.0);
    }

}
