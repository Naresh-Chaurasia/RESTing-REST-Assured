package com.tools;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import io.restassured.*;

public class RestAssured3a_Get_Order {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        ValidatableResponse vr = RestAssured
                .given()
                .when()
                .get("https://simple-tool-rental-api.glitch.me/tools")
                .then();

        vr.statusCode(200);

        // vr.statusCode(201);
        System.out.println("Done...");
    }
}
