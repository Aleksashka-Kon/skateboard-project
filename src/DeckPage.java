import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckPage extends JFrame{
    private JTextPane TextForResult;
    private JLabel DeckLabel;
    private JButton btnToMainMenu;
    private JPanel DeckPage;
    private JLabel ImageLabel;
    ImageIcon DeckIcon = new ImageIcon("kindpng_6114883");

    public DeckPage(){
        setContentPane(DeckPage);
        setSize(1650, 1080);
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
    }
}
