import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.border.Border;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class MyFrame extends JFrame /*implements ActionListener*/
{
    private JLabel label;
    private JButton button;
    private JButton button2;
    // This is a constructor
    MyFrame()
    {
        // Frame parameters (size, etc.)
        this.setSize(800,800);
        this.setTitle("My Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); // Allow resize
        this.setLayout(null); // allows setBounds on panel
        
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
        ImageIcon imageButton = new ImageIcon("logo.png");

        Border border = BorderFactory.createLineBorder(Color.black,5);

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x402f3c)); // default color 


        //creating Jpanel first
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(new BorderLayout());
        panel.setBounds(50,50,500,600);

        //Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.blue);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)); 
        // Create JLabel with proper constructor
        label = new JLabel("This is a label", imageLabel, JLabel.CENTER);
        label.setForeground(Color.white); //color of text 
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP); // Put text below image
        /*label.setBounds(0,0,500,600); */ 
        label.setFont(customFont); // Set the custom font
        label.setIconTextGap(0);
        // label.setBounds(50,50,400,400);

        //Create & add button to pannel 
        button = new JButton();
        button2 = new JButton();
        // button.addActionListener(this);
        button.addActionListener(e -> new AltFrame());//Lambda function
        button2.addActionListener(e -> new GridFrame());
        button.setText("New Frame");
        button.setFocusable(false);
        button.setForeground(Color.red);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setMaximumSize(new Dimension(200, 100));  // Limit to size 
        button.setPreferredSize(new Dimension(20,50));

        button2.setText("Button 2");
        button2.setFocusable(false);
        button2.setForeground(Color.red);
        button2.setBackground(Color.black);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setMaximumSize(new Dimension(200, 100));
        button2.setPreferredSize(new Dimension(20,50));

        button.setAlignmentX(CENTER_ALIGNMENT);   // Buttons centering
        button2.setAlignmentX(CENTER_ALIGNMENT);

        buttonPanel.add(Box.createVerticalGlue());  
        buttonPanel.add(button);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 15)));  // 15px space between buttons
        buttonPanel.add(button2);
        buttonPanel.add(Box.createVerticalGlue()); 
        // button.setIconTextGap(-15);

        panel.add(label, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.setBorder(border);
        this.add(panel);
        this.setVisible(true);
        }
        
        //with class implents ActionsListener
        // public void actionPerformed(ActionEvent e)
        // {
        //     if (e.getSource() == button)
        //     {
        //         // System.out.println("text");
        //         new AltFrame();
        //     }
        // }
}
