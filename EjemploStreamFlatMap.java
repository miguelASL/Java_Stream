package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe")) {
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                        .peek(System.out::println);


        nombres.forEach(System.out::println);

    }
}
