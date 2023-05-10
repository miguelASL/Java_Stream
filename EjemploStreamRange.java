package org.sarmiento.api.stream.ejemplo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream num = IntStream.range(5, 20).peek(System.out::println);
        //El range no incluye en este caso el 20.
        //Si usamos el rangeClosed si lo incluiria.
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("Max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Sum = " + stats.getSum());
        System.out.println("Promedio = " + stats.getAverage());
        System.out.println("Total = " + stats.getCount());
    }
}
