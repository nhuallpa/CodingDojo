package game.of.life

import spock.lang.Specification
import spock.lang.Unroll

class GameOfLife extends Specification{
    
    def "Si una celula viva y tiene un vecinos vivo, se muere la celula"() {
        
        given: "Dada una celula viva con un vecino"
        Celula celula = new Celula(true);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay un vecino vivo"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))
        
        then: "Se muere la celula"
        !celula.estaViva()
    }

    def "Si una celula viva y tiene dos vecinos vivos, la celula vive"() {

        given: "Dada una celula viva con dos vecino"
        Celula celula = new Celula(true);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay dos vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "Sigue la celula viva"
        celula.estaViva()
    }
    def "Si una celula viva y tiene tres vecinos vivos, la celula vive"() {

        given: "Dada una celula viva con tes vecino"
        Celula celula = new Celula(true);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay dos vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "Sigue la celula viva"
        celula.estaViva()
    }

    def "Si una celula viva y tiene más de tres vecinos vivos, la celula muere"() {

        given: "Dada una celula viva con tes vecino"
        Celula celula = new Celula(true);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay más de tres vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "La celula muere"
        !celula.estaViva()
    }

    def "Si una está muerta y tiene un vecino vivo, se muere la celula"() {

        given: "Dada una celula muerta con un vecino"
        Celula celula = new Celula(false);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay un vecino vivo"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "La celula sigue muerta"
        !celula.estaViva()
    }

    def "Si una celula está muerta y tiene dos vecinos vivos, la celula sigue muerta"() {

        given: "Dada una celula muerta con dos vecino"
        Celula celula = new Celula(false);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay dos vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "Sigue la celula muerta"
        !celula.estaViva()
    }

    def "Si una celula está muerta y tiene tres vecinos vivos, la celula vuelve a la vida"() {

        given: "Dada una celula muerta con dos vecino"
        Celula celula = new Celula(false);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay dos vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "La celula revive"
        celula.estaViva()
    }

    def "Si una celula está muerta y tiene más de tres vecinos vivos, la celula sigue muerta"() {

        given: "Dada una celula muerta con dos vecino"
        Celula celula = new Celula(false);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(false),
                new Celula(false),
                new Celula(false),
                new Celula(false),
        ]
        when: "Cuando se verifica que hay dos vecinos vivos"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "Sigue la celula muerta"
        !celula.estaViva()
    }

    @Unroll
    def "Si una celula estado viva es #celulaViva y tiene a todos los vacinos vivos, la célula muere"() {

        given: "Dada una celula muerta con dos vecino"
        Celula celula = new Celula(true);
        Reglas reglas = new Reglas()
        List<Celula> vecinos = [
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
                new Celula(true),
        ]
        when: "Cuando se verifica que todos los vecinos viven"
        celula.setViva(reglas.calcularSiguienteEstado(celula,vecinos))

        then: "La celula muere"
        !celula.estaViva()

        where:
        celulaViva << [true, false]

    }

}
