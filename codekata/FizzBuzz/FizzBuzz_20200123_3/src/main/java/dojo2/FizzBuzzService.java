package dojo2;

import java.util.List;

public class FizzBuzzService {
    public static String traducirNumero(int unNumero){
/*        StringBuilder builder = new StringBuilder();

        String resultado = builder.append(esMultiploDe(unNumero, 3)?"Fizz": "")
                .append(esMultiploDe(unNumero, 5)?"Buzz": "")
                .append(esMultiploDe(unNumero,7)?"Pepe":"")
                .toString();
        return resultado.equals("") ? String.valueOf(unNumero) : resultado;*/

        String resultado = "";
        List<FizzBuzzer> fizzBuzzers = List.of(new Fizz(), new Buzz(), new Pepe());

        for (FizzBuzzer fizzBuzzer : fizzBuzzers) {
            fizzBuzzer.traducir(unNumero, resultado);
        }

        return resultado.equals("") ? String.valueOf(unNumero) : resultado;
    }

    public static boolean esMultiploDe(int unNumero, int condicion){
        return unNumero % condicion == 0;
    }
}
