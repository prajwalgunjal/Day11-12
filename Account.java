package com.bridgelabz.bank;

public class Account {
    private int basebalance;
    private int withdraw;
    private int deposite;

    public Account() {
    }

    public Account(int basebalance) {
        this.basebalance = basebalance;
    }

    public Account(int basebalance, int withdraw, int deposite) {
        this.basebalance = basebalance;
        this.withdraw = withdraw;
        this.deposite = deposite;
    }

    public int getBasebalance() {
        return basebalance;
    }

    public void setBasebalance(int basebalance) {
        this.basebalance = basebalance;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposite() {
        return deposite;
    }

    public void setDeposite(int deposite) {
        this.deposite = deposite;
    }

}
