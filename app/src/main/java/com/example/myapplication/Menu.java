package com.example.myapplication;

public class Menu {
    static Courier algo(){
        SmallSend small = new SmallSend();
        small.setFragility(true);
        small.setSize();
        small.setRequirements();

        BigSend big = new BigSend();
        big.setFragility(false);
        big.setWeight(120);
        big.setSize();
        big.setRequirements();

        Documents doc = new Documents();
        doc.setFromTo("Локтев Д.А. - Тихомирова Е.А.");
        doc.setSize();
        doc.setFragility(false);
        doc.setRequirements();

        Firm firm1 = new Firm("Штрих", "С");
        Firm firm2 = new Firm("Крок", "М");

        Courier courier = new Courier("Иванов Иван Иванович", 123456,
                "Есть личный автомобиль");

        Order order1 = new Order(firm1, small.getSize(), "Сар", "Мск", 8000);
        Order order2 = new Order(firm2, big.getSize(), "Мск", "Влк", 20000);
        Order order3 = new Order(firm2, doc.getSize(), "Тул", "Мск", 4000);
        order1.SetSmall(small);
        order2.SetBig(big);
        order3.SetDoc(doc);
        courier.catchOrder(order1);
        courier.catchOrder(order2);
        courier.catchOrder(order3);
        return courier;
    }
}
