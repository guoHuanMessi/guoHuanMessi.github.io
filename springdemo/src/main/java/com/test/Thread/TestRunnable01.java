package com.test.Thread;

import org.aspectj.weaver.ast.Test;

public class TestRunnable01 implements Runnable {
    private String winner;

    @Override
    public void run() {
        for (int steps = 1; steps <= 100; steps++) {
            System.out.println(Thread.currentThread().getName() + "-->" + steps);
            if(Thread.currentThread().getName().equals("rabbit")&&steps%10==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (gameOver(steps)) {
                break;
            }
        }

    }

    private boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        } else {
            if (steps == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TestRunnable01 web = new TestRunnable01();
        new Thread(web,"tortoise").start();
        new Thread(web,"rabbit").start();
    }
}
