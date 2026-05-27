package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserAPI {

    public static Response getUsers() {

        Response response = RestAssured
                .given()
                .header("x-api-key",
                "free_user_3DhZgAmBTPtRtVSxOJoDvC03eMM")
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users?page=2");

        return response;
    }
}