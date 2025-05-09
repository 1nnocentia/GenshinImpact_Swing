package genshinimpactswing;

import java.awt.*;

public class NavButton extends AbstractButtonComponent {

    public NavButton(String text) {
        super(text, "#575751");
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        setAlignmentX(CENTER_ALIGNMENT);
    }

    @Override
    protected void addAction() {
    }
}
