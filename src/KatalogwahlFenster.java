import javax.swing.*;
import java.awt.*;

public class KatalogwahlFenster {

    public KatalogwahlFenster() {

        //Fenster für die Katalogwahl
        JFrame katalogFenster = new JFrame("Katalogauswahl");
        katalogFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Panel wo alle Elemente drin sind in einem GridBagLayout
        JPanel katalogPanel = new JPanel(new GridBagLayout());

        //Buttons werden hier erstellt
        ImageIcon deutschEnglischIcon = new BildBauer().createImageIcon("img/deEngButton.png");
        Button deutschEnglisch = new Button(deutschEnglischIcon);

        ImageIcon englischDeutschIcon = new BildBauer().createImageIcon("img/engDeButton.png");
        Button englischDeutsch = new Button(englischDeutschIcon);

        ImageIcon zurueckIcon = new BildBauer().createImageIcon("img/zurueckGrossButton.png");
        Button zurueck = new Button(zurueckIcon);

        //hier werden alle Elemente dem katalogPanel hinzugefügt
        //katalogPanel.add(katalogIcon, new GridBagConstraints(0,0,0,1,1,1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));
        katalogPanel.add(deutschEnglisch,new GridBagConstraints(0,0,10,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        katalogPanel.add(englischDeutsch,new GridBagConstraints(0,1,10,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        katalogPanel.add(zurueck,new GridBagConstraints(0,2,10,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),115,0));

        //Komponenten zum Fenster hinzufügen
        katalogFenster.add(katalogPanel);

        //Fenstergröße setzen und anzeigen lassen
        katalogFenster.setSize(400,300);
        katalogFenster.setVisible(true);
    }

    public static void main(String[] a){

        new KatalogwahlFenster();

    }

}