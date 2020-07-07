package com.burabury.obiektowosc.programmers;

public class Programmer implements AwesomeProgrammerJava {

    @Override
    public void drinkCoffee() {
        System.out.println("I'm drinking coffee, siurp siurp");
    }

    @Override
    public void typeJava() {
        System.out.println("public static void main(String[] args){}");
    }

    @Override
    public void playTableSoccer() {
        System.out.println("ping pong");
    }
}
