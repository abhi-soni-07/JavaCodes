import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GETApiCall {
    public static void main(String[] args) {
        String apiURL="https://jsonplaceholder.typicode.com/posts";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiURL))
                .GET()
                .build();
        try{
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            System.out.println("Status Code: "+statusCode);

            String responseBody=httpResponse.body();
            System.out.println("API Response: "+responseBody);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}