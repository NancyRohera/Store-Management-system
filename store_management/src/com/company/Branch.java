package com.company;

import java.util.ArrayList;

public class Branch {
    public String locality;
    ArrayList<String> employees = new ArrayList<String>();

    public Branch(){

    }
    public Branch(String locality){
        this.locality = locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLocality() {
        return locality;
    }

    public void setEmployees(ArrayList<String> employees) {
        this.employees = employees;
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }
}