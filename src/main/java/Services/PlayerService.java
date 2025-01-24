package Services;

import Game.Player;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class PlayerService {
    private static final String BASE_URL = "http://localhost:8080/players"; // Replace with your server URL
    private final HttpClient httpClient = HttpClients.createDefault();
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Sign up a new player
    public Player signUp(Player player) throws IOException {
        return null;
    }

    // Sign in an existing player
    public Player signIn(Player player) throws IOException {
        return null;
    }

    // Update player details
    public Player updatePlayer(String id, Player player) throws IOException {
        return null;
    }

    // Get player by ID
    public Player getPlayer(String id) throws IOException {
        return null;
    }

    // Get player by name
    public Player getPlayerByName(String name) throws IOException {
        return null;
    }

    // Delete player by ID
    public void deletePlayer(String id) throws IOException {

    }

    // Get players sorted by score
    public Player[] getPlayersSortedByScore(int page, int size) throws IOException {
        return null;
    }
}
