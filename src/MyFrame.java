import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

public class MyFrame extends JFrame
{
    private JLabel label;
    
    MyFrame(){
        // Frame parameters (size, etc.)
        this.setSize(500,500);
        this.setTitle("Main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fixed: Changed Jthis to JFrame
        this.setResizable(false); // Do not allow resize 
        
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
        ImageIcon imageLabel = new ImageIcon("waterfall..png"); // Fixed: removed extra dot

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x402f3c)); //change default color background

        // Create JLabel with proper constructor
        label = new JLabel("This is a label", imageLabel, JLabel.CENTER);
        label.setForeground(Color.white); //color of text 
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM); // Put text below image
        label.setFont(customFont); // Set the custom font
        label.setIconTextGap(0);
        
        // Add label to frame
        this.add(label);
        this.setVisible(true);
    }
}