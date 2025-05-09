package genshinimpactswing;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class TopPanel extends JPanel {
    public TopPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(51, 49, 49));

        JLabel titleLabel = new JLabel("Genshin Impact Wiki", JLabel.LEFT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setOpaque(false);

        AbstractButtonComponent discordBtn = new DiscordButton();
        AbstractButtonComponent kofiBtn = new KofiButton();

        buttonPanel.add(discordBtn);
        buttonPanel.add(kofiBtn);

        add(titleLabel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);

    }
}
