package genshinimpactswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class CharacterGridPanel extends AbstractContentPanel {
    protected abstract String[] getCharacterNames();

    @Override
    protected void initUI() {
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBackground(new Color(87, 87, 81));
        for (String name : getCharacterNames()) {
            add(createCharacterCard(name));
        }
    }

    private JPanel createCharacterCard(String name) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(200,250));
        panel.setMaximumSize(new Dimension(200,250));

        ImageIcon oriImg = new ImageIcon(getClass().getResource("/img/" + name + ".png"));
        Image scaleImg = oriImg.getImage().getScaledInstance(180, -1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImg);

        JLabel imgLabel = new JLabel(scaledIcon, JLabel.CENTER);
        JLabel nameLabel = new JLabel(name, JLabel.CENTER);

        panel.add(imgLabel, BorderLayout.CENTER);
        panel.add(nameLabel, BorderLayout.SOUTH);

        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                showCharacterDialog(name);
            }
        });
        
        return panel;
    }

    private void showCharacterDialog(String name) {
        JDialog dialog = new JDialog(SwingUtilities.getWindowAncestor(this), name, Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(400,500);

        ImageIcon oriImg = new ImageIcon(getClass().getResource("/img/" + name + ".png"));
        Image bigImg = oriImg.getImage().getScaledInstance(350, 400, Image.SCALE_SMOOTH);

        JLabel imageLabel = new JLabel(new ImageIcon(bigImg));
        JLabel nameLabel = new JLabel(name, JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));

        dialog.add(imageLabel, BorderLayout.CENTER);
        dialog.add(nameLabel, BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

    }
}
