import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel ImageLabel;
    ImageIcon image = new ImageIcon("SkateboardINeed.png");


    public MainPage(){


        MainPagePanel.setName("Main page");
        setContentPane(MainPagePanel);
        setSize(1650, 1050);
        setVisible(true);
        ParametrsPane.setText("Your name is: " + GlobalContext.insertName  + "/  your height is:"  + GlobalContext.insertHeight + " / Where do you want to skate: " +  PLaceToSkate.place.placeString);
        ImageLabel.setIcon(image);




        btnDeck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnDeck){
                    dispose();
                    new DeckPage();

                }

            }
        });
        btnToWelcomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnToWelcomePage){
                    dispose();
                    new WelcomePage();
                }
            }
        });
        btnWheels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnWheels) {
                    dispose();
                    new WheelsPage();

                }
            }
        });


        btnBearings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnBearings){
                    dispose();
                    new BearingsPage();
                }
            }
        });
        btnGrip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnGrip){
                    dispose();
                    new GripPage();
                }
            }
        });
        btntrucks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btntrucks){
                    dispose();
                    new TrucksPage();
                }
            }
        });
    }
}
