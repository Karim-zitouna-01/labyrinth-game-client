package Game;


import java.io.Serializable;

import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Labyrinth implements Serializable {
    public List<List<Node>> nodes;
    private Coordinates start;
    private Coordinates end;
    private int width;
    private int height;
    private List<Coordinates> shortestPath;


}

