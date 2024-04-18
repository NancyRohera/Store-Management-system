package com.company;
import java.util.ArrayList;

public class Store {
    public String name;
    public int countStores;
    public ArrayList<Branch> locality = new ArrayList<Branch>();
    public ArrayList<String> tempLocality = new ArrayList<String>();

    public void setLocality(ArrayList<String> tempLocality, int count) {
        this.tempLocality = tempLocality;
        for(int i=0;i<count;i++){
            this.locality.add(new Branch(this.tempLocality.get(i)));
        }
    }

    public ArrayList<Branch> getLocality(){
        return this.locality;
    }

    public ArrayList<String> getTempLocality() {
        return tempLocality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountStores() {
        return countStores;
    }

    public void setCountStores(int countStores) {
        this.countStores = countStores;
    }

}