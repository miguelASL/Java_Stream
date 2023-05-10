package org.sarmiento.api.stream.ejemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

/*        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);
        System.out.println("===========");
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
        System.out.println("============");
        Stream<String> nombres = Stream.<String>builder().add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres.forEach(System.out::println);
        System.out.println("============");*/

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);
        lista.stream().forEach(System.out::println);


    }
}
