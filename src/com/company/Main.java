package com.company;

import com.company.Duck.Duck;
import com.company.Duck.MallardDuck;
import com.company.FlyBehaviour.NoFly;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        duck.setFlyBehaviour(new NoFly());
        duck.fly();
    }
}
