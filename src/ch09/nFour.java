package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class nFour extends JFrame {
    public JLabel la=new JLabel("love java");
    public Font f;
    public int size;
    public nFour(){
        Container c=getContentPane();
        c.add(la);

        c.setLayout(new FlowLayout());
        c.addKeyListener(new touch());

        setSize(400,400);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class touch extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            f=la.getFont();
            size=f.getSize();
            if (e.getKeyChar()=='+'){
                la.setFont(new Font("Arial",Font.PLAIN,size+5));
            }
            else if(e.getKeyChar()=='-'&& size>10){
                la.setFont(new Font("Arial",Font.PLAIN,size-5));
            }
        }
        public void keyReleased(KeyEvent e) {}
        public void keyTyped(KeyEvent e) {}
    }
    public static void main(String[] args){
        new nFour();
    }
}
