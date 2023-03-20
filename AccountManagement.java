package com.bridgelabz.bank;
import java.util.Scanner;
public class AccountManagement {
    Account account = new Account(50000);
    Scanner sc = new Scanner(System.in);
    void checkbalance(){
        System.out.println("Current account balance is "+account.getBasebalance());
    }
    void withdraw(){
        System.out.println("ENter the amount for withdrawal ");
        int amount = sc.nextInt();
        if(account.getBasebalance()>=10000)
        {
            amount=account.getBasebalance()-amount;
            if(amount>=10000){
                account.setBasebalance(amount);
                System.out.println("Transaction completed successfully !!!!");
            }
            else {
                System.out.println("You have to keep minimum balance of RS 10,000");
                System.out.println("limit reached sorry!!!!!!");
            }
        }
        else {
            System.out.println("Limit reached you cannot withdraw the amount");
        }
        System.out.println(" updated bank balance is "+account.getBasebalance());
    }
    void credit(){
        System.out.println("Enter the amount for credit");
        int credit = sc.nextInt();
        credit+=account.getBasebalance();
        account.setBasebalance(credit);
        System.out.println(" updated bank balance is "+account.getBasebalance());
    }
}
