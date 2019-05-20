package com.test.Thread;

public class ForeachBreak {
    public static void main(String[] args) {
        out:
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                if(j>5){
                    break out;
                }
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }

        System.out.println(" love you more than i can say");
    }
}
