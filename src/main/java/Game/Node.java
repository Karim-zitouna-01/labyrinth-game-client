package Game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

class Node implements Serializable {
    private Coordinates coordinates;
    private boolean isWall;
    private char value;
    private List<Node> neighbors;
}
