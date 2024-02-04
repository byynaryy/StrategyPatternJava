package org.awesome;

import org.awesome.behaviors.fly.FlyBehavior;
import org.awesome.behaviors.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}
    public void doFly() {
        flyBehavior.fly();
    }
    public void doQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public abstract void display();

}
