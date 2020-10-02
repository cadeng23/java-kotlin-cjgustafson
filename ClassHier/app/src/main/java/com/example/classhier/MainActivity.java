package com.example.classhier;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
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
protected void setLevel(String level) {
 this.worker = worker;
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