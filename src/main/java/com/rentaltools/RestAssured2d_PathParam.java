package com.rentaltools;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured2d_PathParam {

    public static void main(String[] args) {

        Response response = given().pathParam("toolId", 4643)
                .when()
                .get("https://simple-tool-rental-api.glitch.me/tools/{toolId}");

        response.prettyPrint();
    }
}
