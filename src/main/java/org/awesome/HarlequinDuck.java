package org.awesome;

public class HarlequinDuck extends Duck {

    public HarlequinDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Harlequin Duck");
    }
}
