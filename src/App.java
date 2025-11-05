import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception 
    {
        {
            JFrame frame = new JFrame(); //main frame
            //frame parameters (size, ect.)
            frame.setSize(500,500);
            frame.setTitle("Main");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //we need this so the program close properly 
            frame.setVisible(true);
        }
    }
}
