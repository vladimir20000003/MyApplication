package com.example.myapplication;

import javax.xml.transform.Templates;

public class Order {

    static boolean flag;
    static int total;
    private Firm firm;


    private BigSend big;
    private SmallSend small;
    private Documents doc;
    private String marker;


    private String a_o;
    private String a_k;
    private int price;

    public Order(Firm firm, String marker, String a_o, String a_k, int price){
        this.firm = firm;
        this.marker = marker;
        this.a_o = a_o;
        this.a_k = a_k;
        this.price = price;
        total = 0;
        flag = false;
    }

    public String getFirm() {
        return firm.getName();
    }

    public void SetSmall(SmallSend small){
        this.small = small;
    }

    public void SetBig(BigSend big){
        this.big = big;
    }

    public void SetDoc(Documents doc){
        this.doc = doc;
    }


    public String getSend() {
        switch (marker){
            case ("М"):
                return small.getSize();

            case ("Б"):
                return big.getSize();

            case ("Д"):
                return doc.getSize();

            default: break;
        }
        return "-";
    }

    public String getReq(){
        switch (marker){
            case ("М"):
                return small.getRequirements();

            case ("Б"):
                return big.getRequirements();

            case ("Д"):
                return doc.getRequirements();

            default: break;
        }
        return "-";
    }

    public boolean isFra(){
        switch (marker){
            case ("М"):
                return small.isFragility();

            case ("Б"):
                return big.isFragility();

            case ("Д"):
                return doc.isFragility();

            default: break;
        }
        return false;
    }

    public String getA_o() {
        return a_o;
    }

    public String getA_k() {
        return a_k;
    }

    public String getPrice() {

        return String.valueOf(price);
    }
}
