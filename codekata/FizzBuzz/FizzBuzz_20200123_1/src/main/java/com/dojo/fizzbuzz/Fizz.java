package com.dojo.fizzbuzz;

public class Fizz extends FizzBuzzeable {

    @Override
    public String fizzBuzzear(int p) {
        if (esMultiploDe3(p)) {
            return "Fizz";
        } else {
            return next.fizzBuzzear(p);
        }
    }

    private boolean esMultiploDe3(int p) {
        return p % 3 == 0;
    }
}
