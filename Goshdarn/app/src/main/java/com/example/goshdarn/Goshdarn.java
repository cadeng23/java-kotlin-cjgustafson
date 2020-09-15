package com.example.goshdarn;

// This is a program to help monitor stress levels
//if the stress levels get out of controls then the program then triggers
//a "Screw It" state where it tells the user to just move away

public class Goshdarn {

    public Goshdarn(double TotalCrap) {
        getTotalCrap();
        if (TotalCrap < 100.0) {
            //acceptable range
            String message = "You're ok! Your stress level is only" + TotalCrap + "!";
        } else if (TotalCrap > 200.0) {
            // Screw it and go to a different county
            String message = "Get a new id and move to Canada! It's time to drop everything!";
        } else if (TotalCrap < 200.0) {
            lowerstress();
            String message = "Try and relax. You are at " + TotalCrap + ". You do not want to get worse!";
        } else {
            String message = "Error!";
        }
    }


    private double TotalCrap; //Things that are stressing out the user.

    public double getTotalCrap(){
        if (haveBills()==true) {
            TotalCrap += 50.0; //to account for bills
        }
        else {
            TotalCrap += 20.0; //to account for homework
        }
        return TotalCrap;
    }

    public boolean haveBills() { return MonthlyBills <= 1000.0;}

    private double MoneyInBank; // Money the user has (college student)

    public double MonthlyBills; //Total cost of monthly expenses

    public double lowerstress(){return TotalCrap -= 30.0;}

}