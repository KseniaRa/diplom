package final_project.tests.api;

import final_project.allure.Layer;
import final_project.allure.Lead;
import final_project.allure.Microservice;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

@Layer("Api")
@Lead("qa-lead")
@Feature("User data")
public class RegressInTests {
    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    @Story("Get requests")
    @DisplayName("Get a user")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void getSingleUserTest() {
        given().
                when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name", is("Janet"));

    }

    @Test
    @Story("Get requests")
    @DisplayName("Get a single resource, negative test")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void singleResourceFailedTest() {
        given()
                .when()
                .get("/api/unknown/23")
                .then()
                .statusCode(404);
    }


    @Test
    @Story("Post requests")
    @DisplayName("Successful registration test")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void registrationSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"email\": \"eve.holt@reqres.in\", " +
                        "\"password\": \"pistol\" }")
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body("id", is(4))
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }


    @Test
    @Story("Post requests")
    @DisplayName("Successful login test")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void loginSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"email\": \"eve.holt@reqres.in\", " +
                        "\"password\": \"cityslicka\" }")
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }


    @Test
    @Story("Put requests")
    @DisplayName("Successful update of user data")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void updateUserSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"name\": \"morpheus\", " +
                        "\"job\": \"zion resident\" }")
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("name", is("morpheus"))
                .body("job", is("zion resident"));
    }

    @Test
    @Story("Delete requests")
    @DisplayName("Delete user")
    @Microservice("user")
    @Tags({@Tag("web"), @Tag("api")})
    void deleteUserTest (){
        given().
                when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204);
    }
}
