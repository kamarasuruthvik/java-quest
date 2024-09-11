package org.example;

public class Animal {
    public void speak(){
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Bark!");
    }
}

class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meow!");
    }
}