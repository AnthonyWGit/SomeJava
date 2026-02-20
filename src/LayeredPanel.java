import javax.swing.*;
import java.awt.*;

public class LayeredPanel extends JFrame
{
    LayeredPanel()
    {
        JLayeredPane layeredPanel = new JLayeredPane();
        JFrame frame = new JFrame("LayeredPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}