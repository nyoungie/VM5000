import javax.swing.*;
import java.awt.*;

public class LoginFenster {

    public LoginFenster() {

        //Fenster für den Login
        JFrame loginFenster = new JFrame("Anmeldung");

        //Panel wo alle Elemente drin sind in einem GridBagLayout
        JPanel loginPanel = new JPanel(new GridBagLayout());

        //JLabel erstellt und Schriftart verändert
        JLabel anmeldung = new JLabel("Anmeldung", JLabel.CENTER);
        anmeldung.setFont(new Font("Agency FB", Font.BOLD ,30));

        JLabel id_label = new JLabel("ID: ");
        JLabel pw_label = new JLabel("PASSWORT: ");

        //Textfelder zum Abfragen der Logindaten
        JTextField id_txt = new JTextField();
        JTextField pw_txt = new JTextField();

        //Button werden hier erstellt
        ImageIcon zumMenueIcon = new BildBauer().createImageIcon("img/cancelButton.png");
        Button zumMenue = new Button(zumMenueIcon);

        ImageIcon registrierungIcon = new BildBauer().createImageIcon("img/registrierungButton.png");
        Button registrierung = new Button(registrierungIcon);

        ImageIcon loginIcon = new BildBauer().createImageIcon("img/signUpButton.png");
        Button login = new Button(loginIcon);

        //hier werden alle Elemente dem loginPanel hinzugefügt
        loginPanel.add(anmeldung,new GridBagConstraints(0,0,0,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(2,0,2,0),0,0));
        loginPanel.add(zumMenue,new GridBagConstraints(1,0,0,1,1,10,GridBagConstraints.LINE_END,GridBagConstraints.NONE,new Insets(2,0,2,0),0,0));
        loginPanel.add(registrierung,new GridBagConstraints(0,1,0,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(2,0,2,0),0,0));
        loginPanel.add(id_label,new GridBagConstraints(0,2,1,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,70,0,5),0,0));
        loginPanel.add(id_txt,new GridBagConstraints(1,2,1,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,5,0,70),150,0));
        loginPanel.add(pw_label,new GridBagConstraints(0,3,1,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,70,0,5),0,0));
        loginPanel.add(pw_txt,new GridBagConstraints(1,3,1,1,1,10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,5,0,70),150,0));
        loginPanel.add(login,new GridBagConstraints(0, 4, 0, 1, 1, 10,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(2,0,2,0),50,0));

        //Komponente zum Fenster hinzufügen
        loginFenster.add(loginPanel);

        //Fenstergröße setzen und anzeigen lassen
        loginFenster.setSize(400, 300);
        loginFenster.setVisible(true);

    }

    public static void main(String[] a) {

        new LoginFenster();

    }

}
