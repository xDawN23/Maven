package mavengrp;

class Animal {   

    public Animal(){ System.out.println("I'm a super constructor"); }

    public void disp(){ System.out.println("I'm the display method");}

    class Dog extends Animal {

        public Dog(){ super(); System.out.println("Testing super classes"); } // super() is used to call the constructor of the super class.

        final public String color = "brown";

        public void disp(){ System.out.println("I'm the display method of Dog");}

}

}

public class mavengrp {
    
    public static void main(String[] args) {

        System.out.println("This is not my test file");

        Animal animal = new Animal();
        // animal.disp();
        Animal.Dog dog  = animal.new Dog();
        System.out.println("Works");
        // dog.disp();
        // System.out.println(dog.color);

    }

}
