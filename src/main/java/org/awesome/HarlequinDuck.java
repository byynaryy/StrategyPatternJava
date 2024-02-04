package org.awesome;

import org.awesome.behaviors.fly.implementation.FlyWithWings;
import org.awesome.behaviors.quack.implementation.Quack;

public class HarlequinDuck extends Duck {

    public HarlequinDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Harlequin Duck");
    }
}
