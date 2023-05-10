package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia",
                        "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct() //Ojo
                .forEach(System.out::println);


    }
}
