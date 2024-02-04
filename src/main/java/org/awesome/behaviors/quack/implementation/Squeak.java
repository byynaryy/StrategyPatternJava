package org.awesome.behaviors.quack.implementation;

import org.awesome.behaviors.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
