package com.example.goshdarn;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoshDarnUnitTest {

    @Test public void getTotalCrap() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
    }

    @Test public void haveBillsTrue() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
    }

    @Test public void haveBillsFalse() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
    }

    @Test public void MothlyBillsAmount(){
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        double MonthlyBills = 1000.0;
        assertEquals(MonthlyBills, instance.MonthlyBillsAmount(), 1000.0);
    }

    @Test public void MoneyInBankCurrently(){
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
        double MoneyInBank = 100.0;

    }

    @Test public void setCrapLevel() {
        double Crap = 120.5;
        Goshdarn instance = new Goshdarn(Crap);
    }

}
