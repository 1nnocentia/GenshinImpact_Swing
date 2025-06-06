package genshinimpactswing;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class Sidebar extends JPanel {
    private static final String[] BUTTON_NAMES = {
        "Home", "Characters", "Anemo", "Cyro", "Dendro", "Electro", "Geo", "Hydro", "Pyro" 
    };

    public Sidebar(Consumer<String> onButtonClick) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        setBackground(new Color(56, 56, 54));

        for (String name : BUTTON_NAMES) {
            NavButton button = new NavButton(name);
            button.addActionListener(e -> onButtonClick.accept(name));
            add(button);
            add(Box.createVerticalStrut(10));

            // JButton button = new JButton(name);
            // button.addActionListener(e -> onButtonClick.accept(name));
            // button.setFont(new Font("Arial", Font.PLAIN, 14));
            // button.setBackground(new Color(87, 87, 81));
            // // button.setPreferredSize(new Dimension(200,50));
            // // button.setMaximumSize(new Dimension(200,50));
            // button.setAlignmentX(Component.CENTER_ALIGNMENT);
            // button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
            // button.setForeground(Color.WHITE);
            // button.setFocusable(false);
            // button.setBorderPainted(false);
            // // button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            // add(button);
            // add(Box.createVerticalStrut(10));
        }
    }
}