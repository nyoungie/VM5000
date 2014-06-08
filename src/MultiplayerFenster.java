import javax.swing.*;
import java.awt.*;

public class MultiplayerFenster {

    public MultiplayerFenster() {

        //Fenster für den Multiplayer :3
        JFrame multiplayerFenster = new JFrame();
        multiplayerFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Fragepanel im Norden für den Timer, die Lösung der Frage und der Frage
        JPanel fragePanel = new JPanel(new GridBagLayout());
        fragePanel.setBackground(Color.WHITE);

        //Felder für den Timer, die Lösung der Frage und der Frage
        Label timer = new Label("Timer",true,Color.CYAN);
        Label loesung = new Label("Lösung",true,Color.GREEN);
        Label frage = new Label("Vokabel",true,Color.YELLOW);

        //Timer, Lösung und Frage dem fragePanel hinzufügen
        fragePanel.add(timer, new GridBagConstraints(0,0,0,1,1,1,GridBagConstraints.LINE_START,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        fragePanel.add(loesung, new GridBagConstraints(1,0,0,1,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        fragePanel.add(frage, new GridBagConstraints(0,1,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));

        //Antwortpanel in der Mitte für die Antwortmöglichkeiten und den Buzzer
        JPanel antwortPanel = new JPanel();

        //Buttons für die Antworten
        Button antwortEins = new Button("Antwort Eins",500);
        Button antwortZwei = new Button("Antwort Zwei",500);
        Button antwortDrei = new Button("Antwort Drei",500);
        Button antwortVier = new Button("Antwort Vier",500);

        //Buzzer
        Label buzzer = new Label("Buzzer",true,Color.RED);

        //antwortEins, antwortZwei, antwortDrei, antwortVier und buzzer dem antwortPanel hinzufügen
        antwortPanel.add(antwortEins);
        antwortPanel.add(antwortZwei);
        antwortPanel.add(antwortDrei);
        antwortPanel.add(antwortVier);
        antwortPanel.add(buzzer, BorderLayout.SOUTH);

        //Spielerpanel im Süden für die Spieler + Punktestand
        JPanel spielerPanel = new JPanel(new GridBagLayout());

        //Felder für die 3 Spieler + Punktestand
        Label spielerEins = new Label("Spieler 1",true,Color.LIGHT_GRAY);
        Label spielerZwei = new Label("Spieler 2",true,Color.LIGHT_GRAY);
        Label spielerDrei = new Label("Spieler 3",true,Color.LIGHT_GRAY);

        //spielerEins, spielerZwei und spielerDrei dem spielerPanel hinzufügen
        spielerPanel.add(spielerEins, new GridBagConstraints(0,0,0,1,1,1,GridBagConstraints.LINE_START,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        spielerPanel.add(spielerZwei, new GridBagConstraints(1,0,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));
        spielerPanel.add(spielerDrei, new GridBagConstraints(2,0,0,1,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE,new Insets(5,5,5,5),50,0));

        //Komponenten zum multiplayerFenster hinzufügen
        multiplayerFenster.add(fragePanel, BorderLayout.NORTH);
        multiplayerFenster.add(antwortPanel);
        multiplayerFenster.add(spielerPanel, BorderLayout.SOUTH);

        //Fenstergröße setzen und anzeigen lassen
        multiplayerFenster.setSize(400,300);
        multiplayerFenster.setVisible(true);

    }

    public static void main(String[] a){

        new MultiplayerFenster();

    }

}
