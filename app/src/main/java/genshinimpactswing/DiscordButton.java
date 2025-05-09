package genshinimpactswing;

import java.awt.Desktop;
import java.net.URI;

public class DiscordButton extends AbstractButtonComponent {
    public DiscordButton(){
        super("Join Discord", "#3b5bc4");
    }


    @Override
    protected void addAction(){
        addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://discord.com"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
