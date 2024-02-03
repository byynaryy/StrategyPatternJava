package org.awesome;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    //swim();
    public void display() {
        System.out.println("Duck");
    }
}
