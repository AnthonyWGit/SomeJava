import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.border.Border;
public class MyFrame extends JFrame
{
    private JLabel label;
    
    MyFrame()
    {
        // Frame parameters (size, etc.)
        this.setSize(500,500);
        this.setTitle("My Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); // Do not allow resize 
        this.setLayout(null);
        
        //Custom font handler (moved before creating label to set font properly)
        Font customFont = null;
        try{
            Font loadedFont = Font.createFont(Font.TRUETYPE_FONT, new File("Saira-Italic-VariableFont_wdth,wght.ttf"));
            customFont = loadedFont.deriveFont(Font.PLAIN, 40f);            
        }
        catch (Exception e){
            System.out.println("Error in loading file");
        }
        ImageIcon image = new ImageIcon("logo.png");
        ImageIcon imageLabel = new ImageIcon("waterfall..png"); 

        Border border = BorderFactory.createLineBorder(Color.black,5);

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x402f3c)); // default color 


        //creating Jpanel first
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(new BorderLayout());
        panel.setBounds(50,50,500,500);

        // Create JLabel with proper constructor
        label = new JLabel("This is a label", imageLabel, JLabel.CENTER);
        label.setForeground(Color.white); //color of text 
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP); // Put text below image
        label.setFont(customFont); // Set the custom font
        label.setIconTextGap(0);
        label.setBorder(border);
        // label.setBounds(50,50,400,400);

        // Add label to frame
        this.add(panel);
        panel.add(label,BorderLayout.NORTH);
        this.setVisible(true);
    }
}