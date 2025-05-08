package genshinimpactswing;

public class Characters extends CharacterGridPanel {
    private static final String[] CHARACTERS = {
        "Albedo", "Alhaitham", "Aloy", "Arataki Itto", "Baizhu", "Barbara", "Bennett",
        "Diona", "Ganyu", "Jean", "Kamisato Ayaka", "Kamisato Ayato", "Klee", "Kujou Sara", "Nahida"
    };

    @Override
    protected String[] getCharacterNames() {
        return CHARACTERS;
    }
}
