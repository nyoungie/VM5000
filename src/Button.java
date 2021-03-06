import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String name, int dimensionWidth) {

        setText(name);
        setPreferredSize(new Dimension(dimensionWidth,this.getPreferredSize().height));
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setHorizontalAlignment(CENTER);

    }

    public Button(Icon icon) {

        setIcon(icon);
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setHorizontalAlignment(CENTER);

    }

    public Button(Icon icon, int dimensionWidth) {

        setIcon(icon);
        setPreferredSize(new Dimension(dimensionWidth,this.getPreferredSize().height));
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setHorizontalAlignment(CENTER);

    }

}
