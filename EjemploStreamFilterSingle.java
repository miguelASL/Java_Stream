package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());
        //nombres.forEach(System.out::println);

    }
}
