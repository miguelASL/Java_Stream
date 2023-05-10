package org.sarmiento.api.stream.ejemplo;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia",
                        "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct(); //Ojo

        String resultado = nombres.reduce("Resultado concatenacion: ", (a, b) -> a + "# " + b);
        System.out.println(resultado);


    }
}
