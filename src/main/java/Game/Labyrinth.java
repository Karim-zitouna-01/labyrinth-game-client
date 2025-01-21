package Game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labyrinth implements Serializable {
    public List<List<Node>> nodes;
    private Coordinates start;
    private Coordinates end;
    private int width;
    private int height;
    private List<Coordinates> shortestPath;

    public Labyrinth(int var1, int var2) {
        this.width = var1;
        this.height = var2;
        this.nodes = new ArrayList();

        for(int var3 = 0; var3 < var2; ++var3) {
            ArrayList var4 = new ArrayList();

            for(int var5 = 0; var5 < var1; ++var5) {
                var4.add(new Node(var5, var3));
            }

            this.nodes.add(var4);
        }

    }

    public void setStart(Coordinates var1) {
        this.start = var1;
    }

    public void setEnd(Coordinates var1) {
        this.end = var1;
    }

    public void setWall(int var1, int var2) {
        if (var1 >= 0 && var1 < this.width && var2 >= 0 && var2 < this.height) {
            ((Node)((List)this.nodes.get(var2)).get(var1)).setWall(true);
        }

    }

    public Node getNode(int var1, int var2) {
        return var1 >= 0 && var1 < this.width && var2 >= 0 && var2 < this.height ? (Node)((List)this.nodes.get(var2)).get(var1) : null;
    }



     int getHeight() {
        return this.height;
    }

     int getWidth() {
        return this.width;
    }

    Coordinates getEnd() {
        return this.end;
    }

    Coordinates getStart() {
        return this.start;
    }
}

