package genshinimpactswing;

import javax.swing.JPanel;

public abstract class AbstractContentPanel extends JPanel {
    public AbstractContentPanel() {
        initUI();
    }

    protected abstract void initUI();
    
}
