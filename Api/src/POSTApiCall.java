import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class POSTApiCall {
    public static void main(String[] args) {

        String apiURL="https://jsonplaceholder.typicode.com/posts";

        String body = "{\n" +
                " \"title\": \"foo\", \n" +
                " \"body\": \"bar\", \n" +
                " \"userId\": 1\n" +
                " }";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiURL))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        try{
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            System.out.println("Status Code: "+statusCode);

            HttpHeaders headers = httpResponse.headers();
            System.out.println("Response Headers: "+headers.map());

            String responseBody=httpResponse.body();
            System.out.println("API Response: "+responseBody);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}