package extras;

import com.sun.net.httpserver.Headers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExemploHttpClient {
    public static void main(String[] args) {

    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();


        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code :: " + response.statusCode());
        System.out.println("Headers response :: " + response.headers());
//        System.out.println(response.body());
    }

}
