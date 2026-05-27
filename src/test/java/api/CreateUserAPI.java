package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateUserAPI {

    public static Response createUser() {

        String body =
                "{ \"name\": \"Rakesh\", \"job\": \"QA\" }";

        Response response =
                RestAssured
                        .given()
                        .header(
                                "Content-Type",
                                "application/json")
                        .body(body)
                        .when()
                        .post("https://reqres.in/api/users");

        return response;
    }
}