package com.test.Thread;

public class BlockedAllState  {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println(Thread.activeCount()+"-->"+Thread.currentThread().getName());
            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程sleeo"+i);
            }
            System.out.println("创建一个thread");
        });
        Thread.State state =  thread.getState(); //NEW
        System.out.println(state);

        thread.start(); //RUNNABLE
        state =  thread.getState();
        System.out.println(state);

         while(true){
             int num = Thread.activeCount();
              Thread.currentThread().getThreadGroup().list();

             System.out.println(num+"-->"+Thread.currentThread().getName());
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             state =  thread.getState();
             System.out.println(state);
         }


    }
}
