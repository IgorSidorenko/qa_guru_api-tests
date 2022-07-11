package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static specs.Specs.request;

public class UserList {
    @Test
    public void testListUser() {
        given()
                .spec(request)
                .when()
                .get("/users")
                .then()
                .log().body()
                .body("data.findAll{it.email =~/.*?@reqres.in/}.email.flatten()",
                        hasItem("emma.wong@reqres.in"));
    }
}