package com.cambeeler;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is tripping, stumbling over the ground...no air beneath my wings...");
    }

    public String getClass1(){
        String cname = getClass().getName();
        String[] data = cname.split("\\.");
        return data[data.length-1];
    }

}
