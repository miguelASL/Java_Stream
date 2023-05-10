package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println) //Con este comando inspecciona los elementos de dentro
                .map(usuario ->{
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
        });
        List<Usuario> lista = nombres.collect(Collectors.toList()); // Lo convierte en lista.
        lista.forEach(System.out::println); // En este caso saldra en mayuscula ya que itera despues del map.
        //nombres.forEach(System.out::println); // Necesario colocarlo sino no saldria nada.

    }
}
