package com.bridgelabz.Stock;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    Stock stock = new Stock();
Scanner sc = new Scanner(System.in);
    ArrayList<Stock> stocklist =new ArrayList<>();


    void createStock(){
        System.out.println("Enter name of the Stock");
        String name = sc.next();
        stock.setName(name);
        System.out.println("Enter value of the stock each stock");
        int val = sc.nextInt();
        stock.setSharePrice(val);
        System.out.println("Enter number of share are avaliable for that stock");
        int numofshare = sc.nextInt();
        stock.setNumShares(numofshare);
        Stock stock1 = new Stock(name,val,numofshare);
        stocklist.add(stock1);
        System.out.println("Stock added");
    }
    void display(){
        for(int i =0;i<stocklist.size();i++)
        {
            System.out.println(stocklist.get(i));
        }
    }

    @Override
    public String toString() {
        return "StockManagement{" +
                "stock=" + stock +
                ", sc=" + sc +
                ", stocklist=" + stocklist +
                '}';
    }
}
