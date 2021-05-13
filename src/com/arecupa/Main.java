package com.arecupa;

public class Main {
    public void sayHello(String name){
        System.out.println("Hello "+name+"!");
    }

    public static void main(String[] args){
        Main hello = new Main();
        hello.sayHello("Bob");
    }
}
