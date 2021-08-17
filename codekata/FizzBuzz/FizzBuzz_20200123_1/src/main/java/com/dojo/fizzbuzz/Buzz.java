package com.dojo.fizzbuzz;

public class Buzz extends FizzBuzzeable {

    @Override
    public String fizzBuzzear(int p) {
        if (esMultiploDe5(p)) {
            return "Buzz";
        } else {
            return next.fizzBuzzear(p);
        }
    }

    private boolean esMultiploDe5(int p) {
        return p % 5 == 0;
    }
}
