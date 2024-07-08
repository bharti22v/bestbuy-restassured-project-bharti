package com.bestbuy.testbase;

import io.restassured.RestAssured;

public class TestBaseProducts {
    public void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath = "/products";
    }
}