package Services;

import Game.Challenge;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class ChallengeService {
    private static final String BASE_URL = "http://localhost:8080/challenges"; // Replace with your server URL
    private final HttpClient httpClient = HttpClients.createDefault();
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Create a new challenge
    public Challenge createChallenge(Challenge challenge) throws IOException {
        return null;
    }

    // Get a list of challenges with query params
    public Challenge[] getChallenges(int page, int size, String challengerId, String challengedId,
                                     String status, int difficultyLevel, String winnerId, String theme) throws IOException {
        return null;
    }

    // Delete a challenge by ID
    public void deleteChallenge(String id) throws IOException {
    }

    // Accept a challenge
    public Challenge acceptChallenge(String id) throws IOException {
        return null;
    }

    // Decline a challenge
    public void declineChallenge(String id) throws IOException {
    }

    // Update a challenge
    public Challenge updateChallenge(String id, Challenge challenge) throws IOException {
        return null;
    }
}
