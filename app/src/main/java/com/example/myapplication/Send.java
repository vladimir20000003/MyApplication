package com.example.myapplication;

public interface Send {
    void setSize();
    void setFragility(boolean fr);
    void setRequirements();
    void setWeight(int weight);
    default void setFromTo(String data){};

    String getSize();
}
