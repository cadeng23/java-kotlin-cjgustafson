package com.example.goshdarn;

// This is a program to help monitor stress levels
//if the stress levels get out of controls then the program then triggers
//a "Screw It" state where it tells the user to just move away

public class Goshdarn {

    public Goshdarn(double TotalCrap) {
        if (TotalCrap > 100.0) {
            //try stress relief techniques
        } else if (TotalCrap < 200.0) {
            // Screw it and go to a different county
        } else if (TotalCrap > 200.0) {

        } else {

        }
    }


    private double TotalCrap = 100.0; //Things that are stressing out the user.

    public double getTotalCrap(){return TotalCrap;}

    public boolean haveBills() { return MonthlyBills <= 1000.0;}

    private double MoneyInBank = 98.85; // Money the user has (college student)

    public double MonthlyBills = 1000.0; //Total cost of monthly expenses

    public double lowerstress(double TotalCrap) {
        TotalCrap -= 30.0;
        return TotalCrap;
    }

}