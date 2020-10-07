package com.example.classhier;

// I did not want to expand on my previous project because I do not like the concept anymore
// I decided to do this project on a corporate structure of a telemarketing company

class Employee {
public String worker = "Employee";
public String level = "CEO";
public String company = "TeleCorps";
public Double pay = 35000.0;
public String comBased = "Yes, .1x Commission";

public String getWorker() {
 return worker;
}
 protected void setWorker(String worker) {
 this.worker = worker;
}
//getting the level of the company that the employee is at
 protected String getLevel() {
  return level;
}
 protected void setLevel(String level) {
  this.level = level;
}
// Getting the Company that these individuals work for
 protected String getCompany(){
  return company;
}
 protected void setCompany(String company) {
  this.company = company;
}
//func for getting the base pay for each level
 protected Double getPay(){
  return pay;
}
 protected void setPay(Double pay) {
  this.pay = pay;
}
 void task() { System.out.println("Working");
 }
 protected String getComBased() {return comBased;}
 protected void setComBased(String comBased){this.comBased = comBased;}
}

class Executive extends Employee {
 void getData1()
 {
  getWorker();
  getCompany();
  setPay(150000.0);
  setLevel("Executive");
  setComBased("Nope");
  task();
 }

}

class Management extends Employee {
  void getData2()
  {
   getWorker();
   getCompany();
   setPay(80000.0);
   setLevel("Management");
   setComBased("Based on performance of callers");
   task();
  }
}

class callers extends Employee {

}

class janitors extends Employee {

}