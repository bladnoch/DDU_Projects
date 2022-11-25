import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class adapter extends JFrame {

    JTextField txt = new JTextField(10);
    JTextArea area = new JTextArea(10, 10);
    Font t = new Font("굴림체",Font.BOLD,20);
    adapter() {
        setTitle("ex2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(txt);
        c.add(new JScrollPane(area));
        c.addKeyListener(new MyKeyListener());

        txt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                area.append(t.getText() + "\n");
                t.setText("");
            }
        });
        setSize(200,300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_1:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_2:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_3:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_4:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_5:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_6:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_7:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_8:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;
                case KeyEvent.VK_9:
                    txt.setForeground(new Color(r, g, b));
                    txt.setFont(t);
                    break;


                case 'q': System.exit(0);
            }
        }
    }
    public static void main(String [] args) {
        new adapter();
    }
}
