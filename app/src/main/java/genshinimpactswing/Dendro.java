package genshinimpactswing;

public class Dendro extends CharacterGridPanel{
    private static final String[] DENDRO = {
        "Alhaitham", "Baizhu", "Kaveh" ,"Nahida", "Tighnari"
    };

    @Override
    protected String[] getCharacterNames() {
        return DENDRO;
    }
}
