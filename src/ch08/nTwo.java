package ch08;

import javax.swing.*;
import java.awt.*;

public class nTwo extends JFrame {
    public nTwo(){
        Container c=getContentPane();
        c.setLayout(new BorderLayout(50,5));

        c.add(new JButton("North"),BorderLayout.NORTH);
        c.add(new JButton("Center"),BorderLayout.CENTER);
        c.add(new JButton("South"),BorderLayout.SOUTH);
        c.add(new JButton("West"),BorderLayout.WEST);
        c.add(new JButton("East"),BorderLayout.EAST);

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new nTwo();
    }
}
