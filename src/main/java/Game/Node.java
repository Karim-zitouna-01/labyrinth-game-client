package Game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Node implements Serializable {
    private Coordinates coordinates;
    private boolean isWall;
    private char value;
    private List<Node> neighbors;

    public Node(int var1, int var2) {
        this.coordinates = new Coordinates(var1, var2);
        this.isWall = false;
        this.value = '.';
        this.neighbors = new ArrayList();
    }

    public void setWall(boolean var1) {
        this.isWall = var1;
        if (var1) {
            this.value = '#';
        } else {
            this.value = '.';
        }

    }

    public void addNeighbor(Node var1) {
        this.neighbors.add(var1);
    }

    public char getValue() {
        return this.value;
    }

    public boolean isWall() {
        return this.isWall;
    }
}
