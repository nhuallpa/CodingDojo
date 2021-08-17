package com.dojo.fizzbuzz;

public abstract class FizzBuzzeable {

    FizzBuzzeable next;

    public abstract String fizzBuzzear(int p);

    public void agregarChain(FizzBuzzeable next) {
        this.next = next;
    }
}
