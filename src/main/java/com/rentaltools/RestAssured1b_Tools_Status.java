package com.rentaltools;

import static io.restassured.RestAssured.*;

public class RestAssured1b_Tools_Status {
    public static void main(String[] args) {
        // Perform a GET request to fetch users
        given()
                .when()
                .get("https://simple-tool-rental-api.glitch.me/status")
                .then()
                .statusCode(200); // Assert that status code is 200 (OK)
        System.out.println("GET request to fetch users was successful.");

    }
}
