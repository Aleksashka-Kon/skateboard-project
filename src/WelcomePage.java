import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame{
    public WelcomePage(){
        setContentPane(WelcomePage);
        setBounds(600,100,600,600);
        setVisible(true);
        WelcomePage.setName("Welcome page");


        btnSubmitName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalContext.insertName = textPane1.getText();
                GlobalContext.insertHeight = textPane2.getText();
                textPane3.setText("Your name is: " + GlobalContext.insertName + ", " + "your heigh is: " + GlobalContext.insertHeight );
                new MainPage();

            }
        });
    }

    private JButton btnSubmitName;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JPanel WelcomePage;
    private JLabel WeclomeLabel;
    private JLabel HeighLabel;
    private JLabel NameLabel;
}
