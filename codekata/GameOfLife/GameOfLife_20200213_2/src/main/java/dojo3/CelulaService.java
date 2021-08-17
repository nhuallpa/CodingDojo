package dojo3;

public class CelulaService {
    
    boolean evaluarSiSobrevive(boolean[][] matrizDeCelulas, int x, int y) {
        int cantVecinosVivos = 0;
        int sizeX = matrizDeCelulas[0].length;
        int sizeY = matrizDeCelulas.length;

        for (int i = x - 1; i <= x + 1; i++) {
            for(int j = y-1; j <= y +1; j++ ){
                if(estaDentroDeLaMatriz(i, j, sizeX, sizeY) && noEsLaActual(i,j,x,y)){
                    if(matrizDeCelulas[i][j]){
                        cantVecinosVivos = cantVecinosVivos + 1;
                    }
                }
                System.out.println(i + " , " + j + "vecinos: "+cantVecinosVivos);
            }
        }
        return (cantVecinosVivos >1 && cantVecinosVivos <=3);
    }

    private boolean noEsLaActual(int i, int j, int x, int y) {
        return !(i==x && j ==y);
    }

    private boolean estaDentroDeLaMatriz(int x, int y, int sizeX, int sizeY) {
        return !(x<0 || x> sizeX-1 || y<0 || y> sizeY-1);
    }
}
