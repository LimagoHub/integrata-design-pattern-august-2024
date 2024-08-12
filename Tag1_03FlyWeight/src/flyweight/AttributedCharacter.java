package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {

    private static List<AttributedCharacter> characters = new ArrayList<AttributedCharacter>();

    private final char c;
    private final boolean bold;

    public AttributedCharacter(char c, boolean bold) {
        this.c = c;
        this.bold = bold;
        characters.add(this);
    }

    public static AttributedCharacter getInstance(char c, boolean bold) {
        for (AttributedCharacter attributedCharacter : characters) {
            if (attributedCharacter.c == c && attributedCharacter.bold == bold) {
                return attributedCharacter;
            }

        }
        return new AttributedCharacter(c, bold);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
