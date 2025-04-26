package com.rentaltools;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2b_QueryParam1 {

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("category", "trailers");
        params.put("results", 1);

        Response response = given()
                .queryParams(params)
                .when()
                .get("https://simple-tool-rental-api.glitch.me/tools");

        response.prettyPrint();
    }
}
