import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class GridFrame extends JFrame {
    
    GridFrame() { 
        this.setSize(500, 500);
        this.setTitle("Alt frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setResizable(true);
        this.setLayout(new GridLayout(2,2)); // 2 rows 2 columns

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.setVisible(true);
    }
}
