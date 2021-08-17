package game.of.life

import spock.lang.Specification

class UniversoTest extends Specification{

    def "Dada una matriz de 10 x 10, al ejecutar un vualta, se debe mover el universo con las reglas"() {
        given: "Un universo con su estado inicial"
        Universo universo = new Universo(5,5)

        universo.setCelulaViva(1,1, true);

        when:
        universo.ejecutarTurno();

        then:
        universo.imprimirEstado == "..........\\n.*........\\n..........\\n..........\\n..........\\n"

    }

}
