package dojo3

import spock.lang.Specification
import spock.lang.Unroll

class VecinoTest extends Specification {

    def celulaService = new CelulaService()

    @Unroll
    def "Una célula viva muere por falta de vecinos"() {
        given: "una célula viva"
        boolean[][] matrix = generarMatrix()
        matrix[1][1] = true
        matrix[1][2] = estadoVecino12
        when: "evalúo si sobrevive"
        def sobrevive = celulaService.evaluarSiSobrevive(matrix, 1, 1)
        then: "muere"
        sobrevive == false
        where:
        estadoVecino12 << [true, false]
    }

    @Unroll
    def "Una célula viva en una esquina muere por falta de vecinos "() {
        given: "una célula viva"
        boolean[][] matrix = generarMatrix()
        matrix[0][0] = true
        matrix[1][0] = estadoVecino10
        when: "evalúo si sobrevive"
        def sobrevive = celulaService.evaluarSiSobrevive(matrix, 0, 0)
        then: "muere"
        sobrevive == false
        where:
        estadoVecino10 << [true, false]
    }

    @Unroll
    def "Una célula viva en una esquina inferior muere por falta de vecinos "() {
        given: "una célula viva"
        boolean[][] matrix = generarMatrix()
        matrix[2][2] = true
        matrix[2][1] = estadoVecino10
        when: "evalúo si sobrevive"
        def sobrevive = celulaService.evaluarSiSobrevive(matrix, 2, 2)
        then: "muere"
        sobrevive == false
        where:
        estadoVecino10 << [true, false]
    }

    @Unroll
    def "Una célula viva sobrevive si tiene 2 o 3 vecinos vivos"() {
        given: "una célula viva"
        boolean[][] matrix = generarMatrix()
        matrix[1][1] = true
        matrix[0][0] = true
        matrix[2][2] = estadoVecino22
        matrix[1][2] = estadoVecino12
        when: "tiene 2 o 3 vecinos vivos"
        def sobrevive = celulaService.evaluarSiSobrevive(matrix, 1, 1)
        then: "vive"
        sobrevive == true
        where:
        estadoVecino22  |  estadoVecino12
        true            |  true
        false           |   true
        true            |  false
    }

    @Unroll
    def "Una célula en una esquina superior viva sobrevive si tiene 2 o 3 vecinos vivos"() {
        given: "una célula viva"
        boolean[][] matrix = generarMatrix()
        matrix[0][0] = true
        matrix[1][0] = true
        matrix[1][1] = estadoVecino22
        matrix[0][1] = estadoVecino12
        when: "tiene 2 o 3 vecinos vivos"
        def sobrevive = celulaService.evaluarSiSobrevive(matrix, 1, 1)
        then: "vive"
        sobrevive == true
        where:
        estadoVecino22  |  estadoVecino12
        true            |  true
        false           |   true
        true            |  false
    }

     def generarMatrix() {
        boolean [][] matrix = [[false, false, false], [false, false, false], [false, false, false]]
        return matrix
    }
}
