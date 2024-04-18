package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class stock {

    public void manager() throws FileNotFoundException, IOException
    {
        int count = 0;
        System.out.println("enter username ");
        Scanner sc = new Scanner(System.in);
        String username= sc.next();
        System.out.println("enter password ");
        String pass= sc.next();
        if (username.equals("admin")&& pass.equals("admin")) {
            System.out.println("Current Stock is: \n");
            File file = new File("This PCasdfgh\\Desktop\\store_management\\src\\com\\company\\Stock.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while((st = br.readLine())!=null){
                System.out.println(st);
                ++count;
            }
            System.out.println("LINEEE");
            System.out.println(count);
            System.out.println("Do you want to add to stock?");
            String ans = sc.next();
            
            if(ans=="yes"){
                addStock();
            }
            
        }
        else
        {
            System.out.println("you are not authorisxed");
        }

    }
    public void addStock() throws FileNotFoundException, IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("This PC\\Desktop\\store_management\\src\\com\\company\\Stock.txt", true));
        PrintWriter pw = new PrintWriter(writer);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of items you want to add");
        int num = sc.nextInt();
        int count = 0;
        File file = new File("This PC\\Desktop\\store_management\\src\\com\\company\\Stock.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine())!=null){
            System.out.println(st);
            ++count;
        }
        System.out.println("Enter item name qty and then Quantity");
        String item = "";
        
        for(int i=0; i<num;i++){
            ++count;
            String cnt = Integer.toString(count);
            System.out.println("Enter Item: \n");
            item = sc.next();
            System.out.println("Enter Quantity: \n");
            String qty = sc.next();
            System.out.println("\n"+cnt+". "+item+" "+qty);
            
            pw.println(cnt+". "+item+" "+qty);
        }
        pw.close();
        writer.close();
    }
}
