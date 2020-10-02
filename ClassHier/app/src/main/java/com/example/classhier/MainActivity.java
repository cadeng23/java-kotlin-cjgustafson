package com.example.classhier;

// I did not want to expand on my previous project because I do not like the concept anymore
// I decided to do this project on a corporate structure of a telemarketing company
 class Employee {
private String worker = "Employee";
private String level = "CEO";
private String company = "TeleCorps";
private Double pay = 1.50;

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
 void task() {
  System.out.println("Working");
 }
}

class Executive extends Employee {

}

class Management extends Employee {

}

class callers extends Employee {

}

class janitors extends Employee {

}