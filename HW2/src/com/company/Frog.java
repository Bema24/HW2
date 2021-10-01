package com.company;

public class Frog extends Animal{
    private String thisFrog = "эта лягушка яркой окраски";
    public Frog(String name, int age) {
        super(name, age);

    }
    @Override
    public void print() {
        peculiarity = " у " + getName() + " яркая окраска";
        System.out.println("Зовут лягушку " + getName() + "\n возраст лягушки " + getAge() + " лет"+ "\n" + peculiarity +
                "\n"+ thisFrog + "\n----------------------------------------------------");

    }
}
