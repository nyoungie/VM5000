import javax.swing.*;
import java.awt.*;

public class MenuFenster {

    public MenuFenster() {

        //Fenster
        JFrame menuFenster = new JFrame();
        menuFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Logo
        ImageIcon logoIcon = new BildBauer().createImageIcon("img/VM5000.png");
        Label logo = new Label(logoIcon,true,Color.WHITE);

        //Menupanel für die Buttons
        JPanel menuPanel = new JPanel(new GridBagLayout());
        menuPanel.setBackground(Color.WHITE);

        //Buttons
        ImageIcon vokabelnLernenIcon = new BildBauer().createImageIcon("img/vokabelnlernenButton.png");
        Button vokabelnLernen = new Button(vokabelnLernenIcon);

        ImageIcon quizIcon = new BildBauer().createImageIcon("img/quizButton.png");
        Button quiz = new Button(quizIcon);

        ImageIcon creditsIcon = new BildBauer().createImageIcon("img/creditsButton.png");
        Button credits = new Button(creditsIcon);

        //Buttons dem Panel hinzufügen
        menuPanel.add(vokabelnLernen,new GridBagConstraints(0,0,10,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),5,0));
        menuPanel.add(quiz,new GridBagConstraints(0,1,10,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),72,0));
        menuPanel.add(credits,new GridBagConstraints(0,2,10,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),55,0));

        //Komponenten zum Fenster hinzufügen
        menuFenster.add(logo, BorderLayout.NORTH);
        menuFenster.add(menuPanel);

        //Fenstergröße setzen und anzeigen lassen
        menuFenster.pack();
        menuFenster.setVisible(true);

    }

    public static void main(String[] a) {

        new MenuFenster();

    }

}
