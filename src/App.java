import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

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
            ImageIcon imageLabel = new ImageIcon("waterfall..png");

            frame.setIconImage(image.getImage());
            frame.getContentPane().setBackground(new Color(0x402f3c)); //change default color background | rgb or hex hex is 0xF000000 format

            JLabel jlabel = new JLabel("This is a label", imageLabel, JLabel.CENTER);
            jlabel.setForeground(Color.white); //color of text 
            jlabel.setHorizontalTextPosition(JLabel.CENTER);
            jlabel.setVerticalTextPosition(JLabel.BOTTOM); // Put text below image
            jlabel.setHorizontalAlignment(JLabel.CENTER);
            jlabel.setVerticalAlignment(JLabel.CENTER);
            System.out.println("Image loaded: " + (imageLabel.getImageLoadStatus() == java.awt.MediaTracker.COMPLETE));
            System.out.println("Image dimensions: " + imageLabel.getIconWidth() + "x" + imageLabel.getIconHeight());
            System.out.println("Image dimensions: " + image.getIconWidth() + "x" + image.getIconHeight());
            frame.add(jlabel);

            frame.setVisible(true);
            //Custom font handler
            Font customFont = null;
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Saira-Italic-VariableFont_wdth,wght.ttf"));
            customFont = customFont.deriveFont(Font.PLAIN, 40f);

            jlabel.setFont(customFont);
        }
    }
}
