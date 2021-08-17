package dojo2;

public class Fizz implements FizzBuzzer {

    @Override
    public String traducir(int nro, String res) {
        return nro % 3 == 0 ? res.concat("Fizz") : res;
    }
}
