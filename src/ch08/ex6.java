package ch08;

import javax.swing.*;
import java.awt.*;

public class ex6 extends JFrame {
    public ex6(){
        Container c=getContentPane();
        c.setLayout(null);

        JLabel la=new JLabel("hello, world!");
        la.setLocation(130,50);
        la.setSize(200,20);
        c.add(la);

        for (int i=1;i<=9;i++){
            JButton b=new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            c.add(b);
        }

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args){
        new ex6();
    }
}
