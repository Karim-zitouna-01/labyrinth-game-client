package Game;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Challenge implements Serializable {

    private String id;
    private String challengerId;
    private String challengedId;
    private int challengerScore;
    private int challengedScore;
    private String status;
    private LocalDateTime createdAt;
    private String labyrinthId;
    private int difficultyLevel;
    private String winnerId;
    private String theme;


}