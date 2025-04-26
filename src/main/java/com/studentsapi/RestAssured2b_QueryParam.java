package com.studentsapi;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2b_QueryParam {

    // http://localhost:8080/student/list?programme=Computer%20Science
    // http://localhost:8080/student/list?programme=Computer%20Science&limit=1
    public static void main(String[] args) {

        Response response = given()
                .queryParam("programme", "Computer Science")
                .queryParam("limit", 1)
                .when()
                .get("http://localhost:8080/student/list");

        response.prettyPrint();
    }
}
