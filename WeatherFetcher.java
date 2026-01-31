import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherFetcher {

    public static void main(String[] args) {
        try {
            double latitude = 18.52;   // Pune
            double longitude = 73.85;

            String url = "https://api.open-meteo.com/v1/forecast?latitude="
                    + latitude
                    + "&longitude="
                    + longitude
                    + "&current_weather=true";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();

            // Very simple parsing using indexOf and substring
            int tempIndex = body.indexOf("\"temperature\":") + 14;
            int tempEnd = body.indexOf(",", tempIndex);
            String temperature = body.substring(tempIndex, tempEnd);

            int windIndex = body.indexOf("\"windspeed\":") + 12;
            int windEnd = body.indexOf(",", windIndex);
            String windspeed = body.substring(windIndex, windEnd);

            System.out.println("===== Weather Report =====");
            System.out.println("Location: Pune");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Wind Speed: " + windspeed + " km/h");

        } catch (Exception e) {
            System.out.println("Error fetching weather data!");
        }
    }
}
