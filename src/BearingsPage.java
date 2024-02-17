import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BearingsPage extends JFrame {
    private JPanel BearingsPage;
    private JLabel BearingsLabel;
    private JLabel ImageLabel;
    private JButton btnToMainMenu;
    private JLabel AnswerLabel;
    private JButton getResultsbtn;
    private JButton LinkResult;
    private JTextField textFieldCopyUrl;
    String answer;

    public BearingsPage(){


        if (PLaceToSkate.place.placeString == "street"){

            answer =  DatabaseStreet.street.bearingsUrl;



        }
        if (PLaceToSkate.place.placeString == "park"){
            answer= DatabasePark.park.bearingsUrl;

        }
        if (PLaceToSkate.place.placeString == "big-air"){
            answer = DatabaseBig_Air.bigAir.bearingsUrl;

        }

        setContentPane(BearingsPage);
        setSize(1650, 1050);
        setVisible(true);
        BearingsPage.setName("Bearings page");

        getResultsbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnswerLabel.setText( "This is what you need: " + answer);

            }
        });
        LinkResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldCopyUrl.setText(answer);

            }
        });
        btnToMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnToMainMenu){
                    dispose();
                    new MainPage();
                }
            }
        });
    }
}



