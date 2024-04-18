package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class customer extends person{
    int amount=0;
     Scanner input = new Scanner(System.in);
     int option,op;
    public void shop() {
        System.out.println(" chooose category from 1.vegetables\n 2. frozen food \n 3. toiletries ");
        int choice = input.nextInt();
        if (choice == 1)
        {
            do {
                System.out.println(" 1. potatoes price 30 ");
                System.out.println(" 2. tomaotes price 50 ");
                System.out.println(" 3. ladyfinger price 100 ");
                System.out.println(" 4. onions price 40 ");
                option = input.nextInt();
                if (option == 1) {
                    amount = amount + 30;
                } else if (option == 2) {
                    amount = amount + 50;
                } else if (option == 3) {
                    amount = amount + 100;
                } else if (option == 4) {
                    amount = amount + 40;
                }
                System.out.println(" do you want to buy mmore from this cattegory 1.yes\2.no");
                op = input.nextInt();
            }
            while (op==1);
        }
        else if (choice==2)
        {
            do {
                System.out.println(" 1. fish 1100 ");
                System.out.println(" 2. chicken price 400 ");
                System.out.println(" 3. mutton  price 1000 ");
                System.out.println(" 4. beef price 800 ");
                option = input.nextInt();
                if (option == 1) {
                    amount = amount + 1100;
                } else if (option == 2) {
                    amount = amount + 400;
                } else if (option == 3) {
                    amount = amount + 1000;
                } else if (option == 4) {
                    amount = amount + 800;
                }
                System.out.println(" do you want to buy mmore from this cattegory 1.yes\2.no");
                op = input.nextInt();
            }
            while (op==1);
        }
        else if (choice==3)
        {
            do {
                System.out.println(" 1. tissue paper price 200 ");
                System.out.println(" 2. phenyl price 300 ");
                System.out.println(" 3. harpic price  100 ");
                System.out.println(" 4. handwash  price 200 ");
                option = input.nextInt();
                if (option == 1) {
                    amount = amount + 200;
                } else if (option == 2) {
                    amount = amount + 300;
                } else if (option == 3) {
                    amount = amount + 100;
                } else if (option == 4) {
                    amount = amount + 200;
                }
                System.out.println(" do you want to buy mmore from this cattegory 1.yes\2.no");
                op = input.nextInt();
            }
            while (op==1);
        }
    }
    public void  bill ()
    {
        System.out.println(" your total amount is " +amount);
    }

    }

