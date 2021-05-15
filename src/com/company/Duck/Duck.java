package com.company.Duck;

import com.company.FlyBehaviour.FlyBehaviour;
import com.company.QuackBehaviour.Quack;
import com.company.QuackBehaviour.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void Duck(){
        System.out.println("I am a duck!");
    }

    public void fly(){
        flyBehaviour.performFly();
    }

    public void quack(){
        quackBehaviour.performQuack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviourToSet) {
        flyBehaviour = flyBehaviourToSet;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviourToSet) {
        quackBehaviour = quackBehaviourToSet;
    }
}
