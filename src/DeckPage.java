import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckPage extends JFrame{

    private JLabel DeckLabel;
    private JButton btnToMainMenu;
    private JPanel DeckPage;
    private JLabel ImageLabel;
    private JLabel AnswerLabel;
    private JButton getResultsbtn;
    private JButton LinkResult;
    private JTextField textFieldCopyUrl;
    private JLabel HeghtLabel;
    String heightrange;
    String answer;
    String togetherAnswer;
    int heightraneInt;




    public DeckPage(){
        heightraneInt = Integer.parseInt(UsersHeight.height.heightString);

        if(heightraneInt  <= 140){
            heightrange = "Your size is up to 7,5";

        }
        if((heightraneInt >140) && (heightraneInt <= 150)){
            heightrange = "Your size is from 7,5 - 7,75";
        }
        if((heightraneInt >150) && (heightraneInt <= 175)){
            heightrange = "Your size is from 7,75 - 8,125";
        }
        if((heightraneInt >175) && (heightraneInt <= 185)){
            heightrange = "Your size is from 7,875 - 8,25";
        }
        if(heightraneInt > 185){
            heightrange = "Your size is 8,25 and higher";
        }

        if (PLaceToSkate.place.placeString == "street"){

            answer =  DatabaseStreet.street.boardUrl;
            togetherAnswer = heightrange;


        }
        if (PLaceToSkate.place.placeString == "park"){
            answer= DatabasePark.park.boardUrl;
            togetherAnswer = heightrange;
        }
        if (PLaceToSkate.place.placeString == "big-air"){
            answer = DatabaseBig_Air.bigAir.boardUrl;
            togetherAnswer =  heightrange;
        }


        setContentPane(DeckPage);
        setSize(1650, 1050);
        setVisible(true);
        DeckPage.setName("Deck Page");

        btnToMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnToMainMenu){
                    dispose();
                    new MainPage();

                }
            }
        });
        getResultsbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    AnswerLabel.setText( "This is what you need: " + togetherAnswer);

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
