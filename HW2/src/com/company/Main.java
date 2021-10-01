package com.company;

public class Main {
    public static void main(String[] args) {
        Animal[] arrayAnimal ={createObject("Dog"),createObject("Frog"),createObject("Cat")};
        for (Animal f:arrayAnimal) {
            f.print();

        }

    }

    public static Animal createObject(String className){
        switch (className){
            case "Dog":
                Dog dog = new Dog("Alex",13);
                return dog;
            case "Frog":
                Frog frog = new Frog("Dudly",4);
                return frog;
            case "Cat":
                Cat cat = new Cat("Tom",15);
                return cat;
        }
        return null;
    }
}
