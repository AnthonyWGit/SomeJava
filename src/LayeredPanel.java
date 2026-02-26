import javax.swing.*;
import java.awt.*;

public class LayeredPanel extends JFrame
{
    LayeredPanel()
    {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);

        JLayeredPane layeredPanel = new JLayeredPane();
        layeredPanel.add(label1);

        JFrame frame = new JFrame("LayeredPanel");
        frame.add(layeredPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE ON CLOSE doesn't shutdown the whole app 
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}