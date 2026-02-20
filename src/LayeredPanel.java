import javax.swing.*;
import java.awt.*;

public class LayeredPanel extends JFrame
{
    LayeredPanel()
    {
        JLayeredPane layeredPanel = new JLayeredPane();
        JFrame frame = new JFrame("LayeredPanel");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE ON CLOSE doesn't shutdown the whole app 
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}