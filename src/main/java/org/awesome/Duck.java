package org.awesome;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void doFly() {
        flyBehavior.fly();
    }
    public void doQuack() {
        quackBehavior.quack();
    }
    //swim();
    public void display() {
        System.out.println("Duck");
    }
}
