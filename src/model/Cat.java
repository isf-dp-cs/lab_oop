package model;

public class Cat {

    // these are the attributes of the class
    private String name;
    private int lives = 9;

    // this is the constructor of the class
    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("meow!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("i don't know my own name!");
        else
            System.out.println("my name is " + name);
    }

    public void kill() {
        lives = lives - 1;
        if (lives > 0)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
            System.out.println("that's overkill!");
        else
            System.out.println("DEAD CAT :(");
    }

    public static void main(String[] args) {
        /* Do the following things without changing the Cat class */

        // Create a Cat object
        Cat myCat = new Cat("Ollie");

        // Make the Cat speak
        myCat.speak();

        // Get the Cat to print its name

        // Kill the Cat!

    }
}