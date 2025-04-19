package com.tools;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2b_QueryParam2 {

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("category", "trailers");

        Response response = given()
                .queryParams(params)
                .when()
                .get("https://simple-tool-rental-api.glitch.me/tools");

        response.prettyPrint();
    }
}
