package com.dojo.fizzbuzz;

public class FizzBuzz extends FizzBuzzeable {

    @Override
    public String fizzBuzzear(int p) {
        if (esMultiploDe(p, 15)) {
            return "FizzBuzz";
        } else {
            return next.fizzBuzzear(p);
        }
    }

    private boolean esMultiploDe(int p, int multiplo) {
        return p % multiplo == 0;
    }

}
