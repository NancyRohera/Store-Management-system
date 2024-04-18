package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

customer obj = new customer();
employee obj1=new employee();
        String [] empname=new String[100];
        String [] empnumber=new String[100];
        String [] empemail=new String[100];
        String [] custname=new String[100];
        String [] custnumber=new String[100];
        String [] custemail=new String[100];



/*try{
        int op;
            Store store1 = addStore();
            Scanner sc=new Scanner(System.in);

            store1 = addEmp(store1);

            System.out.println(store1.getName());
            System.out.println(store1.getCountStores());
            ArrayList<Branch> getLocal = new ArrayList<Branch>();
            getLocal = store1.getLocality();
            for (int i = 0; i < store1.getCountStores(); i++) {
                System.out.println("Locality " + Integer.toString(i + 1) + " is: " + getLocal.get(i).locality);
                for (int j = 0; j < getLocal.get(i).getEmployees().size(); j++) {
                    System.out.println("Employee " + Integer.toString(j + 1) + " for Locality: " + getLocal.get(i).locality + " is:");
                    System.out.println(getLocal.get(i).getEmployees().get(j));
                    System.out.println("enter name of emp:");
                    empname[i] = sc.next();
                    obj1.setName(empname[i]);
                    System.out.println("enter number of emp:");
                    empnumber[i] = sc.next();
                    obj1.setPhno(empnumber[i]);
                    System.out.println("enter email of emp:");
                    empemail[i] = sc.next();
                    obj1.setEmail(empemail[i]);



                }
            }

 */
        System.out.println("enter username ");
        Scanner sc = new Scanner(System.in);
        String username= sc.next();
        System.out.println("enter password ");
        String pass= sc.next();
        if (username.equals("admin")&& pass.equals("admin"))

        System.out.println(" 1. coustomer\n 2. manager");
            int op1 =sc.nextInt();
            if (op1==1) {
                customer c1 = new customer();
                c1.shop();
                c1.bill();
            }
            else
            {
               stock s1= new stock();
               s1.manager();
            }

    /*    System.out.println("are you the manager or a customer?\n press 1 for manager and 2 for customer");
     switch (op){
         case 1:
             login();
             break;
         case 2:
             mainmenu();
             break;


     }

        }*/
    }

    public static Store addEmp(Store store1){
        ArrayList<Branch> b = new ArrayList<Branch>();
        b = store1.getLocality();
        Scanner s1 = new Scanner(System.in);
        for(int i=0;i<store1.getCountStores();i++){
            System.out.println("How many employees you want to add for Store: "+Integer.toString(i+1));
            int count = s1.nextInt();
            ArrayList<String> empList = new ArrayList<String>();
            for(int j=0;j<count;j++) {
                System.out.println("Enter employee " +Integer.toString(j + 1)+ " for store: " + Integer.toString(i + 1));
                empList.add(s1.next());
            }
            b.get(i).setEmployees(empList);
        }
        return store1;
    }

    public static Store addStore(){
        ArrayList<String> locality = new ArrayList<String>();

        Store store1 = new Store();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the name of store");
        String name = s1.next();

        store1.setName(name);
        System.out.println("Enter the store count");
        int count = s1.nextInt();
        store1.setCountStores(count);

        for(int i=0;i<count;i++){
            System.out.println("Enter Store Locality "+Integer.toString(i+1));
            locality.add(s1.next());
        }
        store1.setLocality(locality, count);

        return store1;
    }

}