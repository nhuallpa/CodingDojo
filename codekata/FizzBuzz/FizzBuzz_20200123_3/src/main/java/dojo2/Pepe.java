package dojo2;

public class Pepe implements FizzBuzzer {

    @Override
    public String traducir(int nro, String res) {
        return nro % 7 == 0 ? res.concat("Pepe") : res;
    }
}
