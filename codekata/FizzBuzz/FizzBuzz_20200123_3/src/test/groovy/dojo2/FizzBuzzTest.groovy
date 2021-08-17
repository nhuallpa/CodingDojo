package dojo2

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzTest extends Specification{

    @Unroll
    def "Al ingresar un número múltiplo de 3 y no de 5 devuelve Fizz"(){
        given: "Un número múltiplo de 3"
        def nro = unNro;

        when: "pido el valor que corresponde"
        def resultado = FizzBuzzService.traducirNumero(unNro)

        then: "me devuelve Fizz"
        resultado == "Fizz"

        where:
        unNro<<[3,6,9];
    }

    @Unroll
    def "Al ingresar un número múltiplo de 5 y no de 3 devuelve Buzz"(){
        given: "Un número múltiplo de 5"
        def nro = unNro;

        when: "pido el valor que corresponde"
        def resultado = FizzBuzzService.traducirNumero(unNro)

        then: "me devuelve Buzz"
        resultado == "Buzz"

        where:
        unNro<<[5,10];
    }

    @Unroll
    def "Al ingresar un número múltiplo de 5 y 3 devuelve FizzBuzz"(){
        given: "Un número múltiplo de 5 y 3"
        def nro = unNro;

        when: "pido el valor que corresponde"
        def resultado = FizzBuzzService.traducirNumero(unNro)

        then: "me devuelve FizzBuzz"
        resultado == "FizzBuzz"

        where:
        unNro<<[15,30,45];
    }
    @Unroll
    def "Al ingresar un número que no es múltiplo de 5 y 3, ni la combinacion de ambos devuelve el numero ingresado"(){
        given: "Un número que no es múltiplo de 5 y 3, ni la combinacion de ambos"
        def nro = unNro;

        when: "pido el valor que corresponde"
        def resultado = FizzBuzzService.traducirNumero(unNro)

        then: "me devuelve el numero ingresado"
        resultado == unNro.toString();

        where:
        unNro<<[1,2,4,8];
    }

    def "Si el numero es 7 devuelve Pepe"(){
        given: "una variable con valor 7"
        Integer unNro = 7

        when: "llmao al servicio de traduccion"
        def resultado = FizzBuzzService.traducirNumero(unNro)

        then: "Se devuelve Pepe"
        resultado == "Pepe"
    }

    def "Si el numero es multiplo de 7 y de 3, devuelve FizzPepe"() {
        given: "un numero multiplo de 7 y 3"
        Integer numero = 21
        when: "Llamo al servicio de traduccion"
        def resultado = FizzBuzzService.traducirNumero(numero)
        then: "Devuelve FizzPepe"
        resultado == "FizzPepe"
    }
    def "Si el numero es multiplo de 7 y de 5, devuelve BuzzPepe"() {
        given: "un numero multiplo de 7 y 5"
        Integer numero = 35
        when: "Llamo al servicio de traduccion"
        def resultado = FizzBuzzService.traducirNumero(numero)
        then: "Devuelve BuzzPepe"
        resultado == "BuzzPepe"
    }
    def "Si el numero es multiplo de 7 y de 3 y 5, devuelve FizzBuzzPepe"() {
        given: "un numero multiplo de 7 y 3 y de 5"
        Integer numero = 105
        when: "Llamo al servicio de traduccion"
        def resultado = FizzBuzzService.traducirNumero(numero)
        then: "Devuelve FizzBuzzPepe"
        resultado == "FizzBuzzPepe"
    }
}
