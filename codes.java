/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ctubanking;

import java.util.Scanner;

/**
 *
 * @author thato
 */
public class CTUbanking {

    public static void main(String[] args){
        
        Menu();
        
    }
    
    public static void Display(double balance, double savings){
        
        System.out.print("Enter your name: ");
        Scanner Name = new Scanner(System.in);
        
        System.out.print("Enter account Number: ");
        Scanner Account = new Scanner(System.in);
        int Acc = Account.nextInt();
        
        System.out.println("Name: " + Name);
        System.out.println("Acc No.: " + Acc);
        System.out.println("Balance: " + balance);
        System.out.println("Savings: " + savings + "\n");
        
        System.out.println("Would you like to make another transaction? (y/n): ");
        Scanner transact = new Scanner(System.in);
        String trans = transact.toString();
        
        if(trans == "y"){
            Menu();
        }else if(trans == "n"){
            System.exit(0);
        }
        
    }
    
    public static void Deposit(double bal){
        
        System.out.println("*----------------------------------------*");
        System.out.println("*               DEPOSIT                  *");
        System.out.println("*----------------------------------------*\n");
        
        boolean loop = false;
        
        do{
            System.out.println("Enter deposit amount: ");
            Scanner deposit = new Scanner(System.in);
            double depo = deposit.nextDouble();
                
            System.out.println("Confirm deposit of R" + depo + "(y/n)");
            Scanner confirm = new Scanner(System.in);
            String valid = confirm.toString();
        
            if((valid == "y") || (valid == "Y")){
                bal += depo;
                
                System.out.println("Current Balance: " + bal);
                
                loop = true;
            }else if((valid == "n") || (valid == "N")){
                loop = false;
                continue;
            }
        
        }while(loop == false);
        
        System.out.println("Would you like to make another transaction? (y/n): ");
        Scanner transact = new Scanner(System.in);
        String trans = transact.toString();
        
        if(trans == "y"){
            Menu();
        }else if(trans == "n"){
            System.exit(0);
        }
        
    }
    
    public static void Save(double savings, double balance){
        
        System.out.println("*----------------------------------------*");
        System.out.println("*               SAVINGS                  *");
        System.out.println("*----------------------------------------*\n");
        
        boolean loop = false;
        
        do{
            System.out.println("Enter amount you wish to save: ");
            Scanner deposit = new Scanner(System.in);
            double depo = deposit.nextDouble();
            
            System.out.println("Enter amount of months to save: ");
            Scanner months = new Scanner(System.in);
            int time = months.nextInt();
                
            System.out.println("Confirm savings of R" + depo + " for " + time + " months (y/n)");
            System.out.println("press q to quit.");
            Scanner confirm = new Scanner(System.in);
            String valid = confirm.toString();
        
            if((valid == "y") || (valid == "Y")){
                if(depo > balance){
                    System.out.println("Insufficient funds to save.");
                    System.out.println("Your current balance is: R" + balance);
                    
                    loop = false;        
                }else if(depo <= balance){
                    
                    if((depo >= 100) || (depo <= 500)){
                        
                        savings += depo;
                    
                        double rate = 0.5/100;
                        
                        System.out.println("transaction successful!!");
                        System.out.println("Your current savings balance is: R" + savings);
                    
                        double A = savings * (1 + rate) * time;
                        double interest = A - savings;
                        
                        System.out.println("Potential interest earned over " + time + "months, is R" + interest);
                        loop = true;
                        
                    }else if((depo >= 600) || (depo <= 1000)){
                        
                        savings += depo;
                    
                        double rate = 2/100;
                        
                        System.out.println("transaction successful!!");
                        System.out.println("Your current savings balance is: " + savings);
                    
                        double A = savings * (1 + rate) * time;
                        
                        System.out.println("Potential interest over " + time + "months, is " + A);
                        loop = true;
                        
                    }else if(depo > 1000){
                        savings += depo;
                    
                        double rate = 5/100;
                        
                        System.out.println("transaction successful!!");
                        System.out.println("Your current savings balance is: " + savings);
                    
                        double A = savings * (1 + rate) * time;
                        
                        System.out.println("Potential interest over " + time + "months, is " + A);
                        loop = true;
                    }
                    
                    
                }
                
            }else if((valid == "n") || (valid == "N")){
                loop = false;
            }else if((valid == "q") || (valid == "Q")){
                loop = true;
            }else{
                System.out.println("Invalid input");
            }
        
        }while(loop == false);
        
        System.out.println("Would you like to make another transaction? (y/n): ");
        Scanner transact = new Scanner(System.in);
        String trans = transact.toString();
        
        if(trans == "y"){
            Menu();
        }else if(trans == "n"){
            System.exit(0);
        }
        
    }
    
    public static void Withdraw(double balance){
        System.out.println("*----------------------------------------*");
        System.out.println("*              WITHDRAWAL                *");
        System.out.println("*----------------------------------------*\n");
        
        boolean loop = false;
        
        do{
            System.out.println("Enter withdrawal amount: ");
            Scanner withdrawal = new Scanner(System.in);
            double wd = withdrawal.nextDouble();
                
            System.out.println("Confirm withdrawal of R" + wd + "(y/n)");
            Scanner confirm = new Scanner(System.in);
            String valid = confirm.toString();
        
            if((valid == "y") || (valid == "Y")){
                
                if(wd > balance){
                    
                    System.out.println("Insufficient funds!!");
                    
                }else if(wd <= balance){
                    
                    balance -= wd;
                    
                    System.out.println("Transaction Successful!!");
                    System.out.println("Remaining balance: R" + balance);
                    
                    loop = true;
                }
                
                loop = true;
            }else if((valid == "n") || (valid == "N")){
                loop = false;
            }
        
        }while(loop == false);
        
        System.out.println("Would you like to make another transaction? (y/n): ");
        Scanner transact = new Scanner(System.in);
        String trans = transact.toString();
        
        if(trans == "y"){
            Menu();
        }else if(trans == "n"){
            System.exit(0);
        }
        
    }
    
    public static void Menu(){
        
        System.out.println("*------------------------------------*");
        System.out.println("*              CTU Banking           *");
        System.out.println("*------------------------------------*\n");
        
        System.out.println("1) Display Account Details");
        System.out.println("2) Deposit");
        System.out.println("3) Save");
        System.out.println("4) Withdraw");
        System.out.println("5) Exit");
        
        double balance = 500;
        double Savings = 1000;
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                
                Display(balance, Savings);
                
            case 2:
                
                Deposit(balance);
                
            case 3:
                Save(Savings, balance);
                
            case 4:
                Withdraw(balance);
                
            case 5:
                System.exit(0);
        }
    }
    
    
}