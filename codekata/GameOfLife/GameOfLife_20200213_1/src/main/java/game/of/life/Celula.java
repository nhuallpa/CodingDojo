package game.of.life;

public class Celula {

    private boolean viva;

    public Celula(boolean estaViva) {
        this.viva = estaViva;
    }

    public boolean estaViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }
}
