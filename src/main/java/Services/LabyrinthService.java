package Services;

import Game.Labyrinth;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;

public class LabyrinthService {
    private static final String BASE_URL = "http://localhost:8080/labyrinth"; // Replace with your server URL
    private final HttpClient httpClient = HttpClients.createDefault();
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Get a labyrinth by ID
    public Labyrinth getLabyrinth(String id) throws IOException {
        return null;
    }
}
