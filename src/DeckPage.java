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
    String answer;
    ImageIcon DeckIcon = new ImageIcon("kindpng_6114883");

    public DeckPage(){
        if (PLaceToSkate.place.placeString == "Street"){
            answer =  DatabaseStreet.street.boardUrl;
        }
        if (PLaceToSkate.place.placeString == "park"){
            answer= DatabasePark.park.boardUrl;
        }
        if (PLaceToSkate.place.placeString == "big-air"){
            answer = DatabaseBig_Air.bigAir.boardUrl;
        }

        setContentPane(DeckPage);
        setSize(1650, 1050);
        setVisible(true);
        DeckPage.setName("Deck Page");
        ImageLabel.setIcon(DeckIcon);
        DeckIcon.setImage(DeckIcon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH));

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
