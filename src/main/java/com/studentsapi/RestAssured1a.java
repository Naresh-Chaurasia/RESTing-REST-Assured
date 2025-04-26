package com.studentsapi;

import io.restassured.RestAssured;

public class RestAssured1a {
    public static void main(String[] args) {

        // RestAssured.
        // given().//header value / param value / token
        // when(). // get call API
        // then(); // read json and validate json.

        RestAssured.given().when().then();
        System.out.print("Hello...");

    }
}
