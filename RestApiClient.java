import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RestApiClient {
    public static void main(String[] args) {
        String apiKey = "d5bad6fc18ef0d6d2a8eb19f1d28a828"; // Replace with a valid API key
        String city = "Surat";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject jsonResponse = new JSONObject(response.toString());
                double tempK = jsonResponse.getJSONObject("main").getDouble("temp");
				double tempC = tempK - 273.15;
				System.out.println("Weather in " + city + ": " + String.format("%.2f", tempC) + "°C");

            } else {
                System.out.println("HTTP request failed. Response Code: " + conn.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}