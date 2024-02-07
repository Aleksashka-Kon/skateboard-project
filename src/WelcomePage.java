import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WelcomePage extends JFrame{

    private String PlaceToSkate;



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
                new MainPage();
                dispose();
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.getItemAt(comboBox1.getSelectedIndex());
                PlaceToSkate = (String) comboBox1.getSelectedItem();

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