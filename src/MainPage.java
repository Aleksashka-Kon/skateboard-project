import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame{
    private JLabel MainMenuLabel;
    private JButton btnWheels;
    private JButton btntrucks;
    private JButton btnDeck;
    private JButton btnGrip;
    private JButton btnBearings;
    private JButton btnToWelcomePage;
    private JPanel MainPagePanel;
    private JTextPane ParametrsPane;
    private JLabel imageLabel;
    ImageIcon skateboardIcon = new ImageIcon("skateboard.png");

    public MainPage(){
        MainPagePanel.setName("Main page");
        setBounds(100,100, 400, 400);
        setContentPane(MainPagePanel);
        setVisible(true);
        ParametrsPane.setText("Your name is: " + GlobalContext.insertName + ", " + "your heigh is:"  + GlobalContext.insertHeight );
        imageLabel.setIcon(skateboardIcon);
        skateboardIcon.setImage(skateboardIcon.getImage().getScaledInstance(250,200, Image.SCALE_SMOOTH));
    }
}
