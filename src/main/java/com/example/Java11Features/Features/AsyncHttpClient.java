package com.example.Java11Features.Features;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author saumitra chauhan
 */
public class AsyncHttpClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        java.net.http.HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.ldapsoft.com"))
                .build();

        CompletableFuture<Void> response =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .thenApply(HttpResponse::body)
                        .thenAccept(System.out::println);
        response.get();
    }
}
