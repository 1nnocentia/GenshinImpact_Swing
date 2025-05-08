package genshinimpactswing;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends AbstractContentPanel {

    public HomePanel() {

    }

    @Override
    protected void initUI() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Welcome to Genshin Wiki!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label, BorderLayout.CENTER);
    }
}
