package Game;

import java.io.Serializable;

public class Player implements Serializable {
    int id;
    String name;
    int score;

    public Player(String name) {
        this.name=name;
        this.score=0;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }
}
