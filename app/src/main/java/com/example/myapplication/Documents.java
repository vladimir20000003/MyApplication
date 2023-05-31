package com.example.myapplication;

public class Documents implements Send{
    private String size;
    private String FromTo;
    private String requirements;
    private boolean fragility;

    @Override
    public void setSize() {
        this.size = "Д";
    }

    @Override
    public void setFragility(boolean fr) {
        this.fragility = fr;
    }

    @Override
    public void setRequirements() {
        this.requirements = "No";
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public void setFromTo(String data) {
        this.FromTo = data;
    }

    public String getSize() {
        return size;
    }
    public String getRequirements() {
        return requirements;
    }

    public String getFromTo() {
        return FromTo;
    }
    public boolean isFragility() {
        return fragility;
    }
}
