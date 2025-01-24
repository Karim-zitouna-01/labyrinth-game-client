package Game;

import java.io.Serializable;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Player implements Serializable {
    int id;
    String name;
    int score;
}
