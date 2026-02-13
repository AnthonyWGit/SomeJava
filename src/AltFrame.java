import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
public class AltFrame extends JFrame {
    
    AltFrame() { 
        this.setSize(500, 500);
        this.setTitle("Alt frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setResizable(true);
        this.setLayout(new FlowLayout());         //Default manager is Flowlayout FOR PANEL 

        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());

        JPanel panelText = new JPanel();
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(100,100));
        panelButton.setBackground(Color.LIGHT_GRAY);

        // this.getContentPane().setBackground(Color.GREEN); Green hurts the eyes 
        
        JLabel label = new JLabel("This is the alternate frame!");
        // label.setBounds(50, 50, 300, 50);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        panelButton.add(new JButton("1"));
        panelButton.add(new JButton("2"));
        panelButton.add(new JButton("3"));
        panelButton.add(new JButton("4"));
        panelButton.add(new JButton("5"));
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));

        panelText.add(label);
        
        parentPanel.add(panelText, BorderLayout.NORTH);
        parentPanel.add(panelButton, BorderLayout.CENTER);
        //So all the visual goes north 
        this.add(parentPanel,BorderLayout.NORTH);
        this.setVisible(true);
    }
}
