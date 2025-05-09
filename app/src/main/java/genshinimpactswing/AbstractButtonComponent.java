package genshinimpactswing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public abstract class AbstractButtonComponent extends JButton{
    
    public AbstractButtonComponent(String text, String hexColor) {
        super(text);
        Color color = Color.decode(hexColor);
        setBackground(color);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setFocusPainted(false);
        setBorderPainted(false);
        addAction();
    }

    protected void addAction(){

    }

}