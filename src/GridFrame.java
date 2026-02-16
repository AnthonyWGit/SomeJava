import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
public class GridFrame extends JFrame {
    
    GridFrame() { 
        this.setSize(500, 500);
        this.setTitle("Alt frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setResizable(true);
        this.setLayout(new GridBagLayout());

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.setVisible(true);
    }
}
