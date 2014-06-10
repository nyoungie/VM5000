import javax.swing.*;
import java.awt.*;

public class KatalogwahlFenster {

    public KatalogwahlFenster() {

        //Fenster für die Katalogwahl
        JFrame katalogFenster = new JFrame("Katalogauswahl");
        katalogFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Hintergrundbild
        Panel katalogBg = new Panel("C:\\Users\\user\\IdeaProjects\\VM5000\\src\\img\\katalogwahlBg.png");

        //Panel
        JPanel katalogPanel = new JPanel(new GridBagLayout());
        katalogPanel.setOpaque(false);

        //Buttons werden hier erstellt
        ImageIcon deutschEnglischIcon = new BildBauer().createImageIcon("img/deEngButton.png");
        Button deutschEnglisch = new Button(deutschEnglischIcon);

        ImageIcon englischDeutschIcon = new BildBauer().createImageIcon("img/engDeButton.png");
        Button englischDeutsch = new Button(englischDeutschIcon);

        ImageIcon zurueckIcon = new BildBauer().createImageIcon("img/zurueckGrossButton.png");
        Button zurueck = new Button(zurueckIcon);

        //hier werden alle Elemente dem katalogPanel hinzugefügt
        katalogPanel.add(deutschEnglisch,new GridBagConstraints(0,0,0,1,1,1,GridBagConstraints.PAGE_START,GridBagConstraints.NONE,new Insets(120,0,0,0),0,0));
        katalogPanel.add(englischDeutsch,new GridBagConstraints(0,1,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        katalogPanel.add(zurueck,new GridBagConstraints(0,2,0,1,1,1,GridBagConstraints.PAGE_END,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));

        katalogBg.add(katalogPanel);

        //Komponenten zum Fenster hinzufügen
        katalogFenster.add(katalogBg);

        //Fenstergröße setzen und anzeigen lassen
        katalogFenster.setSize(415,400);
        katalogFenster.setVisible(true);
    }

    public static void main(String[] a){

        new KatalogwahlFenster();

    }

}