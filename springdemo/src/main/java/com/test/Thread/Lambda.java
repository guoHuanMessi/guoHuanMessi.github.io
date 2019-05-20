package com.test.Thread;

public class Lambda {
    //静态内部类
    static class Test01 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("kobe is a famous basketball star");
            }
        }
    }

    public static void main(String[] args) {
        //new Thread(new Test01()).start();


        //局部内部类
        class Test02 implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("kobe is a famous basketball star");
                }
            }
        }
     //   new Thread(new Test02()).start();


      /*  //匿名内部类 借助接口或者父类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("kobe is a famous basketball star");
                }
            }
        }).start();*/

        //lambda表达式
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("kobe is a famous basketball star");
            }
        } ).start();


    }


}