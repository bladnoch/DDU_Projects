package ch09;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MyFrame2 extends JFrame {
    JTextField txt=new JTextField(10);
    public MyFrame2(){
        Container c = getContentPane();
        txt.addKeyListener(new A());
        c.setLayout(new FlowLayout());
        c.add(txt);
        setSize(400,400);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class A extends KeyAdapter{
        public void keyReleased(KeyEvent e){
            int a=e.getKeyCode();
            if(a==KeyEvent.VK_3){
                txt.setForeground(new Color(0x79803A));
            }

        }

    }

    public static void main(String[] args){
        new MyFrame2();
    }

}
