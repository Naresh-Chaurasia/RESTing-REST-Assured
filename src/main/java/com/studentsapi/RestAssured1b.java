package com.studentsapi;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestAssured1b {
    public static void main(String[] args) {
        // Perform a GET request to fetch users
        given()
                .when()
                .get("http://localhost:8080/student/list"); // Assert that status code is 200 (OK)
        System.out.print("Hello 2...");

    }
}
