package com.sreeramtraders;

import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Pr","Bh","Ya","Sr");

        Consumer<String> stringConsumer = name -> System.out.println(name);
        names.forEach(stringConsumer);
    }
}
