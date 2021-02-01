package com.company;

import java.util.Random;

public class Dog extends Animal {

    private double dogJump = 0.5 + new Random().nextInt(2);
    private int dogSwim = 10 + new Random().nextInt(5);
    private int dogRun = 400 + new Random().nextInt(200);
    private static int coutDog;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        coutDog++;
    }

    @Override
    public void run(int run) {
        if (run <= dogRun) {
            System.out.print("Собака ");
            super.run(run);
        } else System.out.println("Собака " + getName() + " не может пробежать " + run + " м.!");
    }

    @Override
    public void swim(int swim) {
        if (swim <= dogSwim) {
            System.out.print("Собака ");
            super.swim(swim);
        } else System.out.println("Собака " + getName() + " не может проплыть " + swim + " м.!");    }

    @Override
    public void jump(double jump) {
        if (jump <= dogJump) {
            System.out.print("Собака ");
            super.jump(jump);
        } else System.out.println(jump + " м., слишком высоко, собака " + getName() + " не может так прыгнуть!");
    }

    @Override
    public void info() {
        System.out.print("Собака пробегает " + dogRun + "м., прыгает " + dogJump +
                "м. и проплывет " + dogSwim + "м. : ");
        super.info();
    }

    public static int getCoutDog() {
        return coutDog;
    }
}
