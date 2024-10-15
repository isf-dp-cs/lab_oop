package model;

//this is the declaration of the class
public class Superhuman {
    private String name;
    private int age;
    // this is the constructor
    public Superhuman(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        }
    public static void main(String[] args) {
        //This is the method that runs when you press the play button

        //create two superhuman objects

        //print the info for a superhuman

    }
}

