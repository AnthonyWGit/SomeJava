    import javax.swing.BoxLayout;
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
            this.setLayout(new BorderLayout());

            JPanel parentPanel = new JPanel();
            parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

            JPanel panelText = new JPanel();
            JPanel panelButton = new JPanel();
            panelButton.setLayout(new FlowLayout(FlowLayout.CENTER)); //The button will do a column when resizing 
            panelButton.setBackground(Color.LIGHT_GRAY);
            panelButton.setPreferredSize(new Dimension(200, 125));
            panelButton.setMaximumSize(new Dimension(200, 300));
            panelButton.setAlignmentX(CENTER_ALIGNMENT);

            // this.getContentPane().setBackground(Color.GREEN); Green hurts the eyes 
            
            JLabel label = new JLabel("This is the alternate frame!");
            // label.setBounds(50, 50, 300, 50);
            label.setVerticalAlignment(JLabel.CENTER);

            panelButton.add(new JButton("1"));
            panelButton.add(new JButton("2"));
            panelButton.add(new JButton("3"));
            panelButton.add(new JButton("4"));
            panelButton.add(new JButton("5"));

            panelText.add(label);
            
            parentPanel.add(panelText);
            parentPanel.add(panelButton);
            //So all the visual goes north 
            this.add(parentPanel, BorderLayout.NORTH);
            this.setVisible(true);
        }
    }
