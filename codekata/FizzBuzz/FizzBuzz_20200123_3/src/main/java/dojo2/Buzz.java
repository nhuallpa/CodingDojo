package dojo2;

public class Buzz implements FizzBuzzer {

    @Override
    public String traducir(int nro, String res) {
        return nro % 5 == 0 ? res.concat("Buzz") : res;
    }
}
