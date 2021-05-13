package com.arecupa;

public class Main {
    public void sayHello(String name){
        System.out.println("Hello my name is "+name+"!");
    }

    public static void main(String[] args){
        Main hello = new Main();
        hello.sayHello("Herick");
    }
}
