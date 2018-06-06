package com.cambeeler;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat...");
    }

    @Override
    public  void fly(){
        System.out.println(getName() + " is flapping its wings");
    }

//    public String getClass1(){
//        String cname = this.getClass();
//        String[] data = cname.split(".");
//        return data[data.length-1];
//    }
}
