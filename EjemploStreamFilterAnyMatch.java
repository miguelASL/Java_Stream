package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));
        System.out.println(existe);
    }
}
