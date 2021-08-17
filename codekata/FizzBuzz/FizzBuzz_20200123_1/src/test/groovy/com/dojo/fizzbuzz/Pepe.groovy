package com.dojo.fizzbuzz

class Pepe extends FizzBuzzeable {

    @Override
    public String fizzBuzzear(int p) {
        if (esMultiploDe7(p)) {
            return "Pepe";
        } else {
            return next.fizzBuzzear(p);
        }
    }

    private boolean esMultiploDe7(int p) {
        return p % 7 == 0;
    }
}
