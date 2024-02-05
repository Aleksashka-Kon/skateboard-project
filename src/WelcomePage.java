import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WelcomePage extends JFrame{
    public static String level_GUI;
    public WelcomePage(){
        setContentPane(WelcomePage);
         setSize(1650, 1080);
        setVisible(true);
        WelcomePage.setName("Welcome page");

        comboBox1.addItem("");
        comboBox1.addItem("big-air");
        comboBox1.addItem( "park");
        comboBox1.addItem("street");





        btnSubmitName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GlobalContext.insertName = textPane1.getText();
                GlobalContext.insertHeight = textPane2.getText();
                textPane3.setText("Your name is: " + GlobalContext.insertName + ", " + "your heigh is: " + GlobalContext.insertHeight );
                WelcomePage.setVisible(false);
                new MainPage(getX(), getY(), getWidth(), getHeight());
                level_GUI = comboBox1.getItemAt(comboBox1.getSelectedIndex()).toString();
                dispose();
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.getItemAt(comboBox1.getSelectedIndex());
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
    private JComboBox comboBox1;


}
