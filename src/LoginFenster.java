import javax.swing.*;
import java.awt.*;

public class LoginFenster {

    public LoginFenster() {

        //Fenster für den Login
        JFrame loginFenster = new JFrame("Anmeldung");
        loginFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Hintergrundbild
        Panel loginBg = new Panel("C:\\Users\\user\\IdeaProjects\\VM5000\\src\\img\\loginBg.png");

        //Panel
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setOpaque(false);

        //Textfelder zum Abfragen der Logindaten
        JTextField id_txt = new JTextField(10);
        JTextField pw_txt = new JTextField(10);

        //Button werden hier erstellt
        ImageIcon zumMenuIcon = new BildBauer().createImageIcon("img/cancelButton.png");
        Button zumMenu = new Button(zumMenuIcon,400);

        ImageIcon registrierungIcon = new BildBauer().createImageIcon("img/registrierungButton.png");
        Button registrierung = new Button(registrierungIcon,400);

        ImageIcon loginIcon = new BildBauer().createImageIcon("img/signUpButton.png");
        Button login = new Button(loginIcon,400);

        //hier werden alle Elemente dem loginPanel hinzugefügt
        loginPanel.add(zumMenu,new GridBagConstraints(0,1,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,350,0,0),0,0));
        loginPanel.add(registrierung,new GridBagConstraints(0,2,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(30,0,0,0),0,0));
        loginPanel.add(id_txt,new GridBagConstraints(0,3,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(52,130,0,0),0,0));
        loginPanel.add(pw_txt,new GridBagConstraints(0,4,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(14,130,0,0),0,0));
        loginPanel.add(login,new GridBagConstraints(0,5,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(40,0,0,0),0,0));

        loginBg.add(loginPanel);

        //Komponente zum Fenster hinzufügen
        loginFenster.add(loginBg);


        //Fenstergröße setzen und anzeigen lassen
        loginFenster.setSize(415,400);
        loginFenster.setVisible(true);

    }

    public static void main(String[] a) {

        new LoginFenster();

    }

}
