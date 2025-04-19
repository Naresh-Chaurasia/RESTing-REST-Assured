package com.tools;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured4_POST {
    public static void main(String[] args) {

        String requestBody = "{\"clientName\": \"Postman1\", \"clientEmail\": \"valentin1040@example.com\"}";
        ;

        // Sending POST request
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody) // Setting the body
                .when()
                .post("https://simple-tool-rental-api.glitch.me/api-clients") // API endpoint
                .then()
                .extract().response();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Extract access token
        String accessToken = response.jsonPath().getString("accessToken");
        System.out.println("Access Token: " + accessToken);
    }
}
