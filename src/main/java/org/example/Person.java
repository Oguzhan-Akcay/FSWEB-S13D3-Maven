package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String gender;
    double height;
    String skill;

    public  Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public  Person(String gender, double height, String skill, String firstname, String lastname, int age){
        this(firstname, lastname, age);
        this.gender = gender;
        this.height = height;
        this.skill = skill;
    }


    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return  lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
