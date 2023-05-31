package com.example.myapplication;

public class SmallSend implements Send{
    private String size;
    private boolean fragility;
    private String requirements;


    @Override
    public void setSize(){
        this.size = "М";
    }

    @Override
    public void setFragility(boolean fr){
        this.fragility = fr;
    }

    @Override
    public void setRequirements() {
        this.requirements = "No";
    }

    @Override
    public void setWeight(int weight) {

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
}
