package game.of.life;

import java.util.List;

public class Reglas {

    public boolean calcularSiguienteEstado(Celula celula, List<Celula> vecinos) {
        boolean estaViva = false;
        Long cantidaVecinosVivos = vecinos.stream().filter(Celula::estaViva).count();

        if (celula.estaViva()) {
            estaViva = cantidaVecinosVivos == 2 || cantidaVecinosVivos == 3;
        } else {
            estaViva = cantidaVecinosVivos == 3;
        }
        return estaViva;
    }
}
