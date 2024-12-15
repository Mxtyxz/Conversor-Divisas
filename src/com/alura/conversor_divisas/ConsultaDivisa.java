package com.alura.conversor_divisas;

//Utils
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

//Server Side
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;


public class ConsultaDivisa {

        Divisas buscaDivisa(String divisa) {
                Scanner scanner = new Scanner(System.in);
                URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3dd2cc5303a77a31e12ec30c/latest/" + divisa);

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();

            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Failed to fetch data from API",e);
            }

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .setPrettyPrinting()
                    .create();

            return new Gson().fromJson(response.body(), Divisas.class);
        }
}
