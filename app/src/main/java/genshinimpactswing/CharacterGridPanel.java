package genshinimpactswing;

import javax.swing.*;
import java.awt.*;

public class CharacterGridPanel extends AbstractContentPanel {
    private static final String[] CHARACTER_NAMES = {
        "Albedo", "Alhaitham", "Aloy", "Arataki Itto", "Baizhu", "Barbara", "Bennett",
        "Diona", "Ganyu", "Jean", "Kamisato Ayaka", "Kamisato Ayato", "Klee", "Kujou Sara", "Nahida"
    };

    @Override
    protected void initUI() {
        setLayout(new GridLayout(0, 4, 10, 10));
        setBackground(new Color(87, 87, 81));
        for (String name : CHARACTER_NAMES) {
            add(createCharacterCard(name));
        }
    }

    private JPanel createCharacterCard(String name) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(200,250));
        panel.setMaximumSize(new Dimension(200,250));

        ImageIcon oriImg = new ImageIcon(getClass().getResource("/img/" + name + ".png"));
        Image scaleImg = oriImg.getImage().getScaledInstance(180, 230, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImg);

        JLabel imgLabel = new JLabel(scaledIcon);
        JLabel nameLabel = new JLabel(name, JLabel.CENTER);

        panel.add(imgLabel, BorderLayout.CENTER);
        panel.add(nameLabel, BorderLayout.SOUTH);
        return panel;
    }
}
