import java.util.ArrayList;
import java.util.List;

// Define the Player class
class Player {
    private String playerName;
    private String playerID;
    private List<Character> characters = new ArrayList<>();

    public Player(String name, String id) {
        this.playerName = name;
        this.playerID = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}