package com.example.Java11Features.Features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author saumitra chauhan
 */

public class HttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.ldapsoft.com"))
                .build();

        HttpResponse<String> response = client.send(
                request,HttpResponse.BodyHandlers.ofString());

        System.out.println("response.body() = " + response.body());

    }
}