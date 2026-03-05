import javax.swing.*;
import java.awt.*;

public class LayeredPanel extends JFrame
{
    LayeredPanel()
    {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);
        label1.setBounds(50,50,100,100);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(60,60,100,100);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.CYAN);
        label3.setBounds(70,70,100,100);

        JLayeredPane layeredPanel = new JLayeredPane();
        layeredPanel.add(label1);
        layeredPanel.add(label2);
        layeredPanel.add(label3);

        JFrame frame = new JFrame("LayeredPanel");
        frame.add(layeredPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE ON CLOSE doesn't shutdown the whole app 
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
    }
}