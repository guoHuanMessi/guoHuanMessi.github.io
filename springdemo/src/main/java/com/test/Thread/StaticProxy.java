package com.test.Thread;

/**
 * 静态代理
 * 接口：
 * 1：真实角色
 * 2：代理角色
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
    }
}

interface Marry {
    void happyMarry();
}

class You implements Marry {

    @Override
    public void happyMarry() {
        System.out.println("i love the lovergirl  but she dont know ");
    }
}

//代理对象
class WeddingCompany implements Marry {
    private You target;

    public WeddingCompany(You target) {
        this.target = target;
    }
    @Override
    public void happyMarry() {
        before();
        System.out.println("i want to marry her");
        after();

    }

    private void after() {
        System.out.println("i want go on with her forever");
    }

    private void before() {
        System.out.println("i want make her happy");
    }
}