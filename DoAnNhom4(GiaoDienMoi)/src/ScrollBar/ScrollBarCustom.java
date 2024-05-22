package ScrollBar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ScrollBar.ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(51,153,255));
        setBackground(new Color(244, 244, 244));
    }
}
