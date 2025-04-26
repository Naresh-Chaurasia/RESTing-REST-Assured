package com.studentsapi;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import io.restassured.*;

public class RestAssured2a_Get {
    public static void main(String[] args) {
        // Set the base URI for the API
        // RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Perform a GET request to fetch users

        RestAssured
                .given()
                .when()
                .get("http://localhost:8080/student/list")
                .then().statusCode(200);

        // vr.statusCode(201);
    }
}
