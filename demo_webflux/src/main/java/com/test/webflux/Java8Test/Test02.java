package com.test.webflux.Java8Test;

import java.util.function.Function;

public class Test02 {

    public static void main(String[] args) {
        Test02 a = new Test02();
        System.out.println(a.compute(1, item -> item * 2));
        System.out.println(a.compute(2, item -> item + 5));
        System.out.println(a.compute(3, item -> item * item));
        System.out.println(a.covert(5, item -> item +"HELLO WORLD"));
    }

    public int compute(int arg, Function<Integer, Integer> function) {
        int result = function.apply(arg);
        return result;
    }

    public String covert(int a,Function<Integer,String> function) {
        return function.apply(a);
    }

}
