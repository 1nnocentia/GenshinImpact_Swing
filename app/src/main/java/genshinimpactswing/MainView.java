package genshinimpactswing;

import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import java.awt.*;

public class MainView extends JPanel{
    private JPanel sidebar;
    private JPanel contentWrapper;
    private JSplitPane splitPane;

    private Map<String, AbstractContentPanel> contentPanels;

    public MainView() {
        setLayout(new BorderLayout());
        setBackground(new Color(87, 87, 81));

        sidebar = new Sidebar(this::showContent);
        contentWrapper = new JPanel(new BorderLayout());

        contentPanels = new HashMap<>();
        contentPanels.put("Home", new HomePanel());
        contentPanels.put("Characters", new CharacterGridPanel());
        contentPanels.put("Anemo", new CharacterGridPanel());
        contentPanels.put("Cyro", new CharacterGridPanel());
        contentPanels.put("Dendro", new CharacterGridPanel());
        contentPanels.put("Electro", new CharacterGridPanel());
        contentPanels.put("Geo", new CharacterGridPanel());
        contentPanels.put("Hydro", new CharacterGridPanel());
        contentPanels.put("Pyro", new CharacterGridPanel());

        showContent("Characters");

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebar, contentWrapper);
        splitPane.setDividerLocation(215);
        splitPane.setDividerSize(1);
        add(splitPane, BorderLayout.CENTER);
    }

    private void showContent(String name) {
        contentWrapper.removeAll();
        contentWrapper.add(new JScrollPane(contentPanels.get(name)), BorderLayout.CENTER);
        contentWrapper.revalidate();
        contentWrapper.repaint();
    }
    
}
