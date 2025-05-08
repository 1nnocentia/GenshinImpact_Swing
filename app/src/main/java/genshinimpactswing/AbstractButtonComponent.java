package genshinimpactswing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public abstract class AbstractButtonComponent {
    protected JButton button;
    
    public AbstractButtonComponent(String text, String hexColor) {
        button = new JButton(text);
        Color color = Color.decode(hexColor);
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        addAction();
    }

    protected void addAction(){

    }

    public JButton getButton() {
        return button;
    }
}