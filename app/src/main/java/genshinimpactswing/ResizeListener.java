package genshinimpactswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResizeListener extends MouseAdapter {
    private final JFrame frame;
    private static final int BORDER_DRAG = 8;
    private Point clickPoint = null;

    public ResizeListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        clickPoint = e.getPoint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point dragPoint = e.getLocationOnScreen();
        SwingUtilities.convertPointFromScreen(dragPoint, frame);
        int dx = dragPoint.x - clickPoint.x;
        int dy = dragPoint.y - clickPoint.y;

        Rectangle bounds = frame.getBounds();
        bounds.width += dx;
        bounds.height += dy;

        frame.setBounds(bounds);
        clickPoint = dragPoint;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Point p = e.getPoint();
        if (p.x >= frame.getWidth() - BORDER_DRAG && p.y >= frame.getHeight() - BORDER_DRAG) {
            frame.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
        } else {
            frame.setCursor(Cursor.getDefaultCursor());
        }
    }
}
