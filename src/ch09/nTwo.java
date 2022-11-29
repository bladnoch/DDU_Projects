package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

public class nTwo extends JFrame {

    public nTwo(){
        Container c=getContentPane();
        c.setBackground(Color.cyan);

        c.addKeyListener(new my());
        setSize(400,400);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class my extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            if (e.getKeyCode()==KeyEvent.VK_R) {
                getContentPane().setBackground(Color.red);
            }
        }
        public void keyReleased(KeyEvent e){
            if (e.getKeyCode()==KeyEvent.VK_R) {
                getContentPane().setBackground(Color.cyan);
            }
        }
    }

    public static void main(String[] args){
        new nTwo();
    }
}
