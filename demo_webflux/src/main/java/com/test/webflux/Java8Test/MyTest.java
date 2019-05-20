package com.test.webflux.Java8Test;


public class MyTest {
    public static void main(String[] args) {
        MyTest test02 = new MyTest();
        test02.Test(new MyInterface() {
            @Override
            public int test(int a, int b) {
                return a + b;
            }
        });
        //lamdba

        test02.Test((a, b) -> {
            return a + b;
        });

        MyInterface myInterface = (a, b) -> {
            return a + b;
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);


    }

    public void Test(MyInterface myInterface) {
        System.out.println(1);
        System.out.println(myInterface.test(2, 3));
        System.out.println(2);
}


}

@FunctionalInterface
interface MyInterface {
    int test(int a, int b);

    String toString();
}

interface aaa {
    default void bbb() {

    }
}
