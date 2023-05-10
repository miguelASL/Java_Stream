package org.sarmiento.api.stream.ejemplo;

import org.sarmiento.api.stream.ejemplo.models.Usuario;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemplosStreamListToStream {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {

            try{
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        })
                .limit(7)
                .forEach(System.out::println);
    }
}
