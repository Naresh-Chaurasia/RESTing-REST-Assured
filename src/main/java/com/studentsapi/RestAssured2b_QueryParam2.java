package com.studentsapi;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2b_QueryParam2 {

    // http://localhost:8080/student/list?programme=Computer%20Science
    // http://localhost:8080/student/list?programme=Computer%20Science&limit=1
    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("programme", "Computer Science");
        params.put("limit", 2);

        Response response =

                given()
                        .when()
                        .get("http://localhost:8080/student/list");
        // System.out.println(response.toString());

        String output = response.prettyPrint();
        System.out.println("=======================================");
        System.out.println(output);
    }
}
