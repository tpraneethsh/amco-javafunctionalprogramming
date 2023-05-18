package com.sreeramtraders;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionImpl {
    public static void main(String[] args) {
        System.out.println(incrementByOne(1));

        System.out.println(incrementByOneFunc.apply(2));

        //List.of(1,2,3,4).forEach(n -> incrementByOne(n));
        //List.of(1,2,3,4).forEach(FunctionImpl::incrementByOne);
        List<Integer> intList = List.of(1,2,3,4)
                .stream()
                //.map(n -> incrementByOne(n)) or
                .map(FunctionImpl::incrementByOne)
                .collect(Collectors.toList());

        System.out.println(intList);
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n +1;

    static int incrementByOne(int n){
        return n +1;
    }
}
