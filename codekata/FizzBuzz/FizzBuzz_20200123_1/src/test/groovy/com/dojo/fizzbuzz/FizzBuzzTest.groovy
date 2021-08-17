package com.dojo.fizzbuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzTest extends Specification {

    FizzBuzzeable fizzBuzz = new FizzBuzz()
    Buzz buzz = new Buzz()
    Fizz fizz = new Fizz()
    Pepe pepe = new Pepe();
    NumeroText numero = new NumeroText()

    def setup() {
        fizzBuzz.agregarChain(pepe)
        pepe.agregarChain(buzz)
        buzz.agregarChain(fizz)
        fizz.agregarChain(numero)
    }

    def "Cuando es 1 retorna 1"() {
        given: "El numero 1"
        int n = 1

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime 1"
        s == "1"
    }

    def "cuando es 2 retorna 2"() {
        given: "El numero 2"
        int n = 2

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime 2"
        s == "2"
    }

    def "Cuando es un 3 retorna Fizz"() {
        given: "El numero 3"
        int n = 3

        when: "LLamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime Fizz"
        s == "Fizz"
    }

    def "Cuando es un 5 retorna Buzz"() {
        given: "El numero 5"
        int n = 5

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime Buzz"
        s == "Buzz"
    }

    @Unroll
    def "Si es múltiplo de 3, devuelve Fizz"(int n) {
        given: "Un múltiplo de 3"

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime Fizz"
        s == "Fizz"

        where:
        n << [3, 6, 9, 12, 150006, 99]
    }


    @Unroll
    def "Si es múltiplo de 5 devuelve Buzz"(int n) {
        given: "Un múltiplo de 5"

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime Buzz"
        s == "Buzz"

        where:
        n << [5, 10, 25, 100, 150005, 565]
    }

    @Unroll
    def "Si es múltiplo de 15 devuelve FizzBuzz"(int n) {
        given: "Un múltiplo de 15"

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime FizzBuzz"
        s == "FizzBuzz"

        where:
        n << [15, 30, 45, 105, 15000, 75]
    }

    @Unroll
    def "Si es múltiplo de 7 devuelve Pepe"(int n) {
        given: "Un múltiplo de 7"

        when: "Llamo a FizzBuzz"
        String s = fizzBuzz.fizzBuzzear(n)

        then: "Imprime Pepe"
        s == "Pepe"

        where:
        n << [7, 14]
    }




}
