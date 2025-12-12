import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class AltFrame extends JFrame {
    
    AltFrame() { 
        this.setSize(500, 500);
        this.setTitle("Alt frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setResizable(false);
        this.setLayout(null);
        // this.getContentPane().setBackground(Color.GREEN); Green hurts the eyes 
        
        JLabel label = new JLabel("This is the alternate frame!");
        label.setBounds(50, 50, 300, 50);
        this.add(label);
        this.setVisible(true);
    }
}
