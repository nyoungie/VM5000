import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String name, boolean opaque, Color color) {

        setText(name);
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(opaque);
        setBackground(color);

    }

    public Label(Icon icon, boolean opaque, Color color) {

        setIcon(icon);
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(opaque);
        setBackground(color);

    }

}
