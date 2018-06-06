package com.cambeeler;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    public abstract void eat(); // All animals eat
    public abstract void breathe(); // All animals breathe
    public String getName(){
        return name;
    }
}
