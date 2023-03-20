package com.bridgelabz.bank;
import java.util.Scanner;
public class MainAccount {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement();
        while (true) {
            System.out.println("Welcome to bank account system");
            System.out.println("");
            System.out.println("Which operation do you want to perform");
            System.out.println("1) check balance \n2) withdraw amount \n3) deposite amount \n4) exit");
            int ip = sc.nextInt();
            System.out.println("");
            switch (ip) {
                case 1 -> {
                    accountManagement.checkbalance();
                }
                case 2 -> {
                    accountManagement.withdraw();
                }
                case 3 -> {
                    accountManagement.credit();
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }
}