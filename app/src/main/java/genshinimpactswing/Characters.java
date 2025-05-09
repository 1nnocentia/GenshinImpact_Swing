package genshinimpactswing;

public class Characters extends CharacterGridPanel {
    private static final String[] CHARACTERS = {
        "Albedo", "Alhaitham", "Aloy", "Arataki Itto", "Baizhu", "Barbara", "Bennett", "Cyno",
        "Diona", "Fischl", "Ganyu", "Jean", "Kaedehara Kazuha", "Kamisato Ayaka", "Kamisato Ayato", "Kaveh", "Keqing", "Klee", 
        "Kujou Sara", "Nahida", "Raiden Shogun", "Razor", "Tighnari", "Venti", "Wanderer", "Xiao", 
        "Yae Miko", "Yumemizuki Mizuki", "Zhongli"
    };

    @Override
    protected String[] getCharacterNames() {
        return CHARACTERS;
    }
}
