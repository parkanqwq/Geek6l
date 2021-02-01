package com.company;

import java.util.Random;

public class Cat extends Animal {

    private double catJump = 2 + new Random().nextInt(2);
    private int  catRun = 200 + new Random().nextInt(200);
    private static int coutCat;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        coutCat++;
    }

    @Override
    public void run(int run) {
        if (run <= catRun) {
            System.out.print("Кошка ");
            super.run(run);
        } else System.out.println("Кошка " + getName() + " не может пробежать " + run + " м.!");
    }

    @Override
    public void swim(int swim) {
        System.out.println("Кошка " + getName() + " не умеет плавать");
    }

    @Override
    public void jump(double jump) {
        if (jump <= catJump) {
            System.out.print("Кошка ");
            super.jump(jump);
        } else System.out.println(jump + " м., слишком высоко, кошка " + getName() + " не может так прыгнуть!");
    }

    @Override
    public void info() {
        System.out.print("Кошка пробегает " + catRun + "м. и прыгает " + catJump + "м. : ");
        super.info();
    }

    public static int getCoutCat() {
        return coutCat;
    }
}
