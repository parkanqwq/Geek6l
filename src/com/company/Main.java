package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        Cat cat = new Cat("Фрося", "синего", 2);
        Cat cat2 = new Cat("Надя","желтого", 3);

        cat.info();
        cat2.info();

        System.out.println();
        cat.jump(2);
        cat.jump(10);
        cat.run(100);
        cat.run(300);
        cat.swim(10);
        System.out.println();
        Dog dog = new Dog("Киша", "белого", 4);
        dog.info();
        System.out.println();
        dog.jump(0.4);
        dog.jump(5);
        dog.run(250);
        dog.run(1200);
        dog.swim(8);
        dog.swim(16);

        countAll();
    }

    private static void countAll(){
        System.out.println();
        System.out.println("Было создано: " + Animal.getCoutAnimal() + " животных, где");
        System.out.println(Cat.getCoutCat() + " cat(s)");
        System.out.println(Dog.getCoutDog() + " dog(s)");
    }
}
