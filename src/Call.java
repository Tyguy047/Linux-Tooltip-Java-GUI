import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Call {

    static String server = "https://tips.tycloud.dev"; // Change this to the domain or IP of your server if you are running a custom server.

    public static String HTTPCall() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(server))
                    .build();

            HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());

            return res.body();   // ✅ RETURN the body
        } catch (Exception e) {
            e.printStackTrace();
            return "Error, server cannot be accessed at this time!";         // return something on error
        }
    }
}