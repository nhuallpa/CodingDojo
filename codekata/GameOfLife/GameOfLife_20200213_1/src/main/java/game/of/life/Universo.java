package game.of.life;

public class Universo {

    Celula[][] matriz = new Celula[10][10];

    public void setCelulaViva(int coordenadaX, int coordenadaY, boolean estado) {
        matriz[coordenadaX][coordenadaY].setViva(estado);
    }
}
