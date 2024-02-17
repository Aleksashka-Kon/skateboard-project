import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TrucksPage extends JFrame{

    private JLabel TruksLabel;
    private JLabel ImageLabel;
    private JButton btnToMainMenu;
    private JLabel AnswerLabel;
    private JButton getResultsbtn;
    private JButton LinkResult;
    private JTextField textFieldCopyUrl;
    private JLabel HeghtLabel;
    private JPanel TrucksPage;
    int heightraneInt;
    String TruksRangeString;
    String answer;
    public TrucksPage(){
        heightraneInt = Integer.parseInt(UsersHeight.height.heightString);
        setContentPane(TrucksPage);
        setSize(1650, 1050);
        setVisible(true);
        TrucksPage.setName("Trucks Page");
        if( (heightraneInt > 140)&& (heightraneInt <= 150)){
            TruksRangeString = "Your trucks are size 22";

        }
        if( (heightraneInt > 150)&& (heightraneInt <= 175)){
            TruksRangeString = "Your trucks are size 33";
        }
        if((heightraneInt > 175) && (heightraneInt <= 185)){
            TruksRangeString = "Your trucks are size 44";
        }
        if(heightraneInt > 175){
            TruksRangeString = "Your trucks are size 55 and bigger";
        }
        if (Objects.equals(PLaceToSkate.place.placeString, "street")){
            answer = DatabaseStreet.street.truksUrl + " or " + DatabaseBig_Air.bigAir2.truksUrl;
        }
        if (Objects.equals(PLaceToSkate.place.placeString, "big-air")){
            answer = DatabaseBig_Air.bigAir.truksUrl;
        }
        if (Objects.equals(PLaceToSkate.place.placeString, "park")){
            answer = DatabasePark.park.truksUrl + " or " + DatabasePark.park2.truksUrl;
            System.out.println(answer);
        }


        btnToMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnToMainMenu) {
                    dispose();
                    new MainPage();
                }


            }
        });
        getResultsbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnswerLabel.setText(TruksRangeString);

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
