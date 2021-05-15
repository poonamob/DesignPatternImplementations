package com.company.Duck;

import com.company.FlyBehaviour.FlyBehaviour;
import com.company.FlyBehaviour.FlyWithWings;
import com.company.QuackBehaviour.Quack;
import com.company.QuackBehaviour.QuackBehaviour;

public class MallardDuck extends Duck {
    public MallardDuck() {
        System.out.println("I am a mallard duck!");
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }


}
