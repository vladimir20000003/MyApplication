package com.example.myapplication;

import java.util.ArrayList;

public class Courier {
    private String FIO;
    private int SettlementAccount;
    private String Abilities;
    private ArrayList<Order> orders;

    public Courier(String FIO, int settlementAccount, String abilities) {
        this.FIO = FIO;
        SettlementAccount = settlementAccount;
        Abilities = abilities;
        orders = new ArrayList<>();
    }

    public void catchOrder(Order order){
        orders.add(order);
    }

    public String getFIO() {
        return FIO;
    }

    public int getSettlementAccount() {
        return SettlementAccount;
    }

    public String getAbilities() {
        return Abilities;
    }

    public ArrayList<Order> getSends() {
        return orders;
    }
}
