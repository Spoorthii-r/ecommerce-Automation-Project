package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserAPI {

    public static Response getUsers() {

        Response response =
                RestAssured
                        .given()
                        .when()
                        .get("https://reqres.in/api/users?page=2");

        return response;
    }
}