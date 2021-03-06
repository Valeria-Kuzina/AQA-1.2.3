package ru.netology.PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostmanEchoTest {
    @Test
    void shouldPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Oleg")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("Oleg"))
        ;
    }
}
