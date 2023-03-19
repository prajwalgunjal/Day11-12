package com.bridgelabz.Stock;

import java.util.Scanner;

public class Stock {
        static Scanner sc = new Scanner(System.in);
        private String name;
        private int numShares;
        private int sharePrice;

    public Stock(String name, int numShares, int sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public Stock() {
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumShares() {
            return numShares;
        }

        public void setNumShares(int numShares) {
            this.numShares = numShares;
        }

        public double getSharePrice() {
            return sharePrice;
        }

        public void setSharePrice(int sharePrice) {
            this.sharePrice = sharePrice;
        }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", numShares=" + numShares +
                ", sharePrice=" + sharePrice +
                '}';
    }
}


