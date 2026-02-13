import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
public class AltFrame extends JFrame {
    
    AltFrame() { 
        this.setSize(500, 500);
        this.setTitle("Alt frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setResizable(true);
        this.setLayout(null);

        JPanel panelText = new JPanel();
        JPanel panelButton = new JPanel();
        //A flow manager so if resize the label still shows
        this.setLayout(new BorderLayout());
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
        
        this.add(panelText, BorderLayout.NORTH);
        this.add(panelButton, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
