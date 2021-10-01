package com.company;

public class Cat extends Animal{
    private String thisCat = "этот кот любит спать под лучами солнца";
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        peculiarity = " у " + getName() + " хвост рыжий";
        System.out.println("Зовут кота " + getName() + "\n возраст кота " + getAge() + " лет" + peculiarity +
                "\n"+ thisCat + "\n" + "-----------------------------------------------------------------");

    }
}
