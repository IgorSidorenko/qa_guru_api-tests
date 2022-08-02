package tests;

import io.qameta.allure.AllureId;
import models.BodyData;
import models.User;
import models.UserData;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static specs.Specs.*;


public class ReqresTests {
    @Test
    @AllureId("11695")
    void listUsersTest() {

        given()
                .spec(request)
                .when().get("/users?page=2")
                .then().spec(responseSucces)
                .body("total", is(12));

    }

    @Test
    @AllureId("11696")
    void listSingleUserTest() {

        given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseSucces)
                .body("data.first_name", is("Janet"));
    }

    @Test
    @AllureId("11697")
    void createUserTest() {

        User user = new User();
        user.setName("morpheus");
        user.setJob("leader");

        given()
                .spec(request)
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .spec(responseCreate)
                .body("name", is("morpheus"));
    }

    @Test
    @AllureId("11698")
    void loginUnsuccesfullTest() {

        User user = new User();
        user.setEmail("peter@klaven");

        given()
                .spec(request)
                .body(user)
                .when()
                .post("/login")
                .then()
                .spec(responseUnsuccesLogin)
                .body("error", is("Missing password"));
    }

    @Test
    @AllureId("11699")
    void deleteUserTest() {

        given()
                .when()
                .delete("https://reqres.in/api/users2")
                .then()
                .spec(responseDelete);
    }

    @Test
    @AllureId("11700")
    void singleUserWithModel() {

        UserData data = given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseSucces)
                .log()
                .body()
                .extract()
                .as(UserData.class);

        assertEquals(2, data.getUser().getId());
    }

    @Test
    @AllureId("11701")
    void singleUserWithLombok() {

        UserData data = given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseSucces)
                .log()
                .body()
                .extract()
                .as(UserData.class);
        assertEquals(2, data.getUser().getId());
    }

    @Test
    @AllureId("11702")
    void UsersWithLombok() {

        BodyData data = given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseSucces)
                .log()
                .body()
                .extract()
                .as(BodyData.class);
        assertEquals(null, data.getBody().getUserData());
    }

}