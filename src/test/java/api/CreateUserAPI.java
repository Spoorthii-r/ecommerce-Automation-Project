package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateUserAPI {

    public static Response createUser() {

        String body =
                "{ \"name\": \"Rakesh\", \"job\": \"QA\" }";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key",
                "free_user_3DhZgAmBTPtRtVSxOJoDvC03eMM")
                .baseUri("https://reqres.in")
                .body(body)
                .when()
                .post("/api/users");

        return response;
    }
}