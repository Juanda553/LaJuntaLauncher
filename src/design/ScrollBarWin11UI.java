package design;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import javax.swing.plaf.ComponentUI;
import gui.LoadingWindow;

/**
 *
 * @author Raven
 */
public class ScrollBarWin11UI extends BasicScrollBarUI {
    
    public static ComponentUI createUI(JComponent c) {
        return new ScrollBarWin11UI();
    }

    public final Color darkBackgroundColor = new Color(40, 40, 40);
    public final Color scrollColor = Color.GRAY;
    
    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        c.setPreferredSize(new Dimension(10, 10));
        c.setForeground(scrollColor);
    }

    @Override
    protected void configureScrollBarColors() {
        super.configureScrollBarColors();
        thumbColor = scrollColor;
        trackColor = darkBackgroundColor;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createZeroButton();
    }

    private JButton createZeroButton() {
        JButton button = new JButton();
        Dimension zeroDim = new Dimension(0, 0);
        button.setPreferredSize(zeroDim);
        button.setMinimumSize(zeroDim);
        button.setMaximumSize(zeroDim);
        return button;
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
            return;
        }
        g.setColor(scrollColor);
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.setColor(darkBackgroundColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void paintDecreaseHighlight(Graphics g) {
        // No op
    }

    @Override
    protected void paintIncreaseHighlight(Graphics g) {
        // No op
    }
}