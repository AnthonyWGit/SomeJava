import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception 
    {
        {
            JFrame frame = new JFrame(); //main frame
            //frame parameters (size, ect.)
            frame.setSize(500,500);
            frame.setTitle("Main");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //we need this so the program close properly 
            frame.setResizable(false); // Do not allow resize 


            ImageIcon image = new ImageIcon("logo.png");

            frame.setIconImage(image.getImage());
            frame.getContentPane().setBackground(new Color(0x402f3c)); //change default color background | rgb or hex hex is 0xF000000 format

            JLabel jlabel = new JLabel();
            jlabel.setText("This is a label");
            jlabel.setForeground(Color.white);;
            
            frame.add(jlabel);

            frame.setVisible(true);
        }
    }
}
