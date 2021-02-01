package com.company;

public abstract class Animal {

    private String name;
    private String color;
    private int age;
    private static int coutAnimal;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        coutAnimal++;
    }



    public void info(){
        System.out.println(name + ", " + color + " цвета, " + age + " года");
    }

    public void run(int run){
        System.out.println(name + " пробежала " + run + " м.");
    }

    public void swim(int swim){
        System.out.println(name + " проплыла " + swim + " м.");
    }

    public void jump(double jump){
        System.out.println(name + " подпрыгнула на " + jump + " м.");
    }

    public String getName() {
        return name;
    }

    public static int getCoutAnimal() {
        return coutAnimal;
    }
}
