package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class nOne extends JFrame {
    public JLabel l=new JLabel("사랑해");
    public nOne(){
        Container c=getContentPane();
        l.addMouseListener(new MyMouse());
        c.add(l);
        c.setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);

    }
    class MyMouse implements MouseListener {
        public void mouseEntered(MouseEvent e) {
           l.setText("자기야");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            l.setText("사랑해");
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }
    public static void main(String[] args){
        new nOne();
    }
}
