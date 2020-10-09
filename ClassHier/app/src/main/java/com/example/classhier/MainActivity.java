package com.example.classhier;

// I did not want to expand on my previous project because I do not like the concept anymore
// I decided to do this project on a corporate structure of a telemarketing company

class Employee {

 public String level = "CEO";
 public Double pay = 0.0;
 public Boolean comBased = true;
 public Double Commission = 1.0;
 // Stock Sold on the phone over the previous month
 public Double ValueSold = 0.0;
 public Double HoursWorked = 40.0;
 //Rating on service given by customers on
 public Double SurveyRating = 3.0;

 public Double getValueSold() {
  return ValueSold;
 }
 protected Double setValueSold(Double ValueSold) { this.ValueSold = ValueSold; return ValueSold; }

 //getting the level of the company that the employee is at
 protected String getLevel() {
  return level;
 }
 protected void setLevel(String level) {
  this.level = level;
 }

 //func for getting the base pay for each level
 protected Double getPay() { return pay; }
 protected Double setPay(Double pay) { this.pay = pay; return pay; }

 void task() { System.out.println("Working"); }

 protected Boolean TComBased() { return true; }
 protected Boolean FComBased() {return false;}

 public Double getCommission() { return Commission; }
 public Double setCommission(Double Commission) { this.Commission = Commission; return Commission; }

 //Hours worked in the week
 public Double getHoursWorked() { return HoursWorked; }
 public void setHoursWorked(Double HoursWorked) { this.HoursWorked = HoursWorked; }

 public Double getSurveyRating() { return SurveyRating; }
 public Double setSurveyRating(Double SurveyRating) { this.SurveyRating = SurveyRating; return SurveyRating;}
}

class Executive extends Employee {
 void getData1()
 {
  setPay(150000.0);
  setHoursWorked(30.0);
  setLevel("Executive");
  FComBased();
  task();
 }

}

class Management extends Employee {
 double Profit;
 double NewPay;
  void getData2()
  {
   setHoursWorked(40.0);
   setLevel("Management");
   TComBased();
   task();
   if (Profit > 1000000.0)
   {
    NewPay = setCommission(1.7) * setPay(80000.0);
   }
   else if(Profit > 900000.0)
   {
    NewPay = setCommission(1.5) * setPay(80000.0);
   }
   else if(Profit > 700000.0)
   {
    NewPay = setCommission(1.2) * setPay(80000.0);
   }
   else
   {
    NewPay = setPay(80000.0);
   }
  }
}

class callers extends Employee {
 double Val;
 double NewPay;

 void getData3() {
  setLevel("Caller");
  TComBased();
  Val = setValueSold(50000.0);
  setPay(25000.0);
  setSurveyRating(3.5);
  setHoursWorked(45.0);
  task();
  if (Val > 100000.0)
  {
   NewPay = setCommission(2.5) * setPay(25000.0);
  }
  else if (Val > 75000.0)
  {
   NewPay = setCommission(2.0) * setPay(25000.0);
  }
  else if (Val > 50000.0)
  {
   NewPay = setCommission(1.5) * setPay(25000.0);
  }
  else
   {
   NewPay = setPay(25000.0);
  }
 }
}


 class cusService extends Employee {
  double Serv;
  double NewPay;

  void getData4() {
   setLevel("Customer Service");
   TComBased();
   getHoursWorked();
   Serv = setSurveyRating(4.5);
   if (Serv > 4.4)
   {
    NewPay = setCommission(1.5) * setPay(35000.0);
   } else if (Serv > 3.9)
   {
    NewPay = setCommission(1.3) * setPay(35000.0);
   }
   else if (Serv > 2.9)
   {
    NewPay = setCommission(1.1) * setPay(35000.0);
   }
   else
    {
    NewPay = setPay(35000.0);
   }
  }
 }

 class janitors extends Employee {
  void getData5() {
   setLevel("Janitor");
   FComBased();
   setPay(25000.0);
   setHoursWorked(25.0);
   task();
  }
 }