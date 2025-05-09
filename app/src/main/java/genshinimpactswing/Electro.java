package genshinimpactswing;

public class Electro extends CharacterGridPanel {
    private static final String[] ELECTRO = {
        "Cyno", "Fischl", "Keqing", "Kujou Sara", "Raiden Shogun", "Razor", "Yae Miko"
    };

    @Override
    protected String[] getCharacterNames() {
        return ELECTRO;
    }
}
