package org.awesome.behaviors.quack.implementation;

import org.awesome.behaviors.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
