import javax.swing.*;

public class Ex1_JFrameAss
{
    public static void main(String[] args) 
    {
        JFrame f= new JFrame();

        JButton b=new JButton("click");
        b.setBounds(130,100,100,40);

        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}