import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static sun.tools.jconsole.inspector.XDataViewer.dispose;

public class WheelsPage extends JFrame{
    private JPanel WheelsPage;
    private JLabel WheelsLabel;
    private JLabel ImageLabel;
    private JButton btnToMainMenu;
    private JLabel AnswerLabel;
    private JButton getResultsbtn;
    private JButton LinkResult;
    private JTextField textFieldCopyUrl;
    String answer;

    String random;

    public WheelsPage() {
        setContentPane(WheelsPage);
        setSize(1650, 1050);
        setVisible(true);
        setName("Wheels Page");


        if(PLaceToSkate.place.placeString == "street"){
            answer = DatabaseStreet.street.wheelsUrl + " or " + DatabaseStreet.street2.wheelsUrl;
        }
        if(PLaceToSkate.place.placeString == "park"){
            answer = DatabasePark.park.wheelsUrl + " or " + DatabasePark.park2.wheelsUrl;
        }
        if(PLaceToSkate.place.placeString == "big-air"){
            answer = DatabaseBig_Air.bigAir.wheelsUrl + " or " +DatabaseBig_Air.bigAir2.wheelsUrl;
        }


        btnToMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnToMainMenu){
                    WheelsPage.setVisible(false);
                    new MainPage();
                }


            }
        });
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
    }
}
