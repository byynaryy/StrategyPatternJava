package org.awesome.behaviors.quack.implementation;

import org.awesome.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
