package ch08;

import javax.swing.*;
import java.awt.*;

public class nThree extends JFrame{


    public nThree(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("100+200"));
        c.add(new JButton("="));
        c.add(new JLabel("300"));

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new nThree();
    }
}
