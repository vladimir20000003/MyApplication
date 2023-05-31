package com.example.myapplication;

public class BigSend implements Send{
    private String size;
    private boolean fragility;
    private String requirements;

    private int weight;

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public void setSize(){
        this.size = "Б";
    }

    @Override
    public void setFragility(boolean fr){
        this.fragility = fr;
    }

    @Override
    public void setRequirements() {
        this.requirements = "Car";
    }

    public String getSize() {
        return size;
    }

    public boolean isFragility() {
        return fragility;
    }

    public String getRequirements() {
        return requirements;
    }

    public int getWeight() {
        return weight;
    }
}
