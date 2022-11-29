import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    public JTextField txt = new JTextField(10);
    public JTextArea area = new JTextArea(10, 10);

    public MyFrame() {
        Container c = getContentPane();
        txt.addKeyListener(new MyKey());
        c.setLayout(new FlowLayout());
        c.add(txt);
        c.add(area);
        setSize(200, 300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKey extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            int k = e.getKeyCode();
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);


            if (k == KeyEvent.VK_0 || k == KeyEvent.VK_1 || k == KeyEvent.VK_2 || k == KeyEvent.VK_3 || k == KeyEvent.VK_4 ||
                    k == KeyEvent.VK_5 || k == KeyEvent.VK_6 || k == KeyEvent.VK_7 || k == KeyEvent.VK_8 || k == KeyEvent.VK_9) {
                txt.setForeground(new Color(r, g, b));
                txt.setFont(new Font("Bold",Font.BOLD,20));
            }
            else if(k==KeyEvent.VK_ENTER){
                area.getText(txt);
                txt.setText("");
            }
        }
    }

        public static void main(String[] args) {
            new MyFrame();

        }
    }

