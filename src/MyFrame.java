import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    private JLabel color=new JLabel("txt");
    private JTextField txt=new JTextField(10);
    public MyFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JTextField txt=new JTextField(10);
        JTextArea area=new JTextArea(10,10);
        Container c=getContentPane();

        c.setLayout(new FlowLayout());
        c.add(txt);
        c.add(area);

        txt.addKeyListener(new MyKeyListener());
        c.setFocusable(true);
        c.requestFocus();
        c.add(color);

        setSize(200,300);
        setVisible(true);

    }
class MyKeyListener extends KeyAdapter{

    public void keyReleased(KeyEvent e){

        int r=(int) (Math.random()*256);
        int g=(int) (Math.random()*256);
        int b=(int) (Math.random()*256);


        if (e.getKeyChar() == KeyEvent.VK_0 ||
                e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 ||
                e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 ||
                e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_6 ||
                e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 ||
                e.getKeyCode() == KeyEvent.VK_9){


            txt.setForeground(new Color(r,g,b));
            txt.setFont(new Font("Bold",Font.PLAIN,20));

        }

    }
}
    public static void main(String[] args){
        new MyFrame();

    }
}
