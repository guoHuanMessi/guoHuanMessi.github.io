package com.test.webflux.Java8Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stream01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton button = new JButton("My Button");

        button.addActionListener(e-> System.out.println("zhuhuan press"));
        jFrame.add(button);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
