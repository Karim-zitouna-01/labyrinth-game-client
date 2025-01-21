package Game;

import java.io.Serializable;
import java.util.Objects;

public class Coordinates implements Serializable {
    private int x;
    private int y;

    public Coordinates(int var1, int var2) {
        this.x = var1;
        this.y = var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            Coordinates var2 = (Coordinates)var1;
            return this.x == var2.x && this.y == var2.y;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.x, this.y});
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int var1) {
        this.y = var1;
    }

    public void setX(int var1) {
        this.x = var1;
    }
}
