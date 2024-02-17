import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GripPage extends JFrame{
    private JPanel BearingsPage;
    private JPanel GripPage;
    private JLabel GripLabel;
    private JLabel ImageLabel;
    private JButton btnToMainMenu;
    private JLabel AnswerLabel;
    private JButton getResultsbtn;
    private JButton LinkResult;
    private JTextField textFieldCopyUrl;
    String answer;
    public GripPage(){

        setContentPane(BearingsPage);
        setSize(1650, 1050);
        setVisible(true);
        BearingsPage.setName("Grip page");

        if (PLaceToSkate.place.placeString == "street"){

            answer =  DatabaseStreet.street.gripUrl;



        }
        if (PLaceToSkate.place.placeString == "park"){
            answer= DatabasePark.park.gripUrl;

        }
        if (PLaceToSkate.place.placeString == "big-air"){
            answer = DatabaseBig_Air.bigAir.gripUrl;

        }


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
