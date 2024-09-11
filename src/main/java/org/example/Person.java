package org.example;

public class Person {
    public String name;
    public int age;
    public String occupation;

    public Person(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void displayDetails(){
        System.out.println(name+ " " + age + " " + occupation);
    }

    public void birthday(){
        System.out.println("Happy Birthday!");
        this.age = this.age + 1;
    }
}
