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
    private JLabel imageLabel;





    public MainPage(){


        MainPagePanel.setName("Main page");
        setContentPane(MainPagePanel);
        setSize(1650, 1050);
        setVisible(true);
        ParametrsPane.setText("Your name is: " + GlobalContext.insertName  + "/  your height is:"  + GlobalContext.insertHeight + " / Where do you want to skate: " +  PLaceToSkate.place.placeString);


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
    }
}
