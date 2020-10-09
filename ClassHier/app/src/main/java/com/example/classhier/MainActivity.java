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
 protected void setValueSold(Double ValueSold) {
  this.ValueSold = ValueSold;
 }

 //getting the level of the company that the employee is at
 protected String getLevel() {
  return level;
 }
 protected void setLevel(String level) {
  this.level = level;
 }

 // Getting the Company that these individuals work for


 //func for getting the base pay for each level
 protected Double getPay() { return pay; }
 protected void setPay(Double pay) {
  this.pay = pay;
 }

 void task() { System.out.println("Working"); }

 protected Boolean TComBased() { return true; }
 protected Boolean FComBased() {return false;}

 public Double getCommission() { return Commission; }
 public Double setCommission(Double Commission) { this.Commission = Commission; return Commission; }

 public Double getHoursWorked() { return HoursWorked; }
 public void setHoursWorked(Double HoursWorked;) { this.HoursWorked = HoursWorked; }

 public Double getSurveyRating() { return SurveyRating; }
 public void setSurveyRating(Double SurveyRating) { this.SurveyRating = SurveyRating; }
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
  void getData2()
  {
   setPay(80000.0);
   setHoursWorked(40.0);
   setLevel("Management");
   TComBased();
   task();
  }
}

class callers extends Employee {
  void getData3()
  {
   setPay(25000.0);
   setLevel("Caller");
   TComBased();
   setValueSold(50000.0);
   Payday = setPay(25000.0);
   setSurveyRating(3.5);
   setHoursWorked(45.0);

   task();

   if (Serv > 4.4)
   {
    double Com = setCommission(1.5);
    NewPay = Com * Payday;
   }
   else if (Serv > 3.9)
   {
    Com = setCommission(1.3);
    NewPay = Com * Payday;
   }
   else if (Serv > 2.9)
   {
    Com = setCommission(1.1);
    NewPay = Com * Payday;
   }
   else
   {
    getCommission();
    NewPay = Payday;
   }
  }
}

class cusService extends Employee {
 void getData4()
 {
  setLevel("Customer Service");
  getComBased();
  getHoursWorked();
  Payday = setPay(30000.0);
  Serv = setSurveyRating(4.5);
  if (Serv > 4.4)
  {
   Com = setCommission(1.5);
   NewPay = Com * Payday;
  }
  else if (Serv > 3.9)
  {
   Com = setCommission(1.3);
   NewPay = Com * Payday;
  }
  else if (Serv > 2.9)
  {
   Com = setCommission(1.1);
   NewPay = Com * Payday;
  }
  else
  {
   getCommission();
   NewPay = Payday;
  }
 }
}

class janitors extends Employee {
  void getData5()
  {
   setLevel("Janitor");
   setComBased("No");
   task();
  }
}