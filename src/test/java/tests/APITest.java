package tests;

import api.GetUserAPI;
import api.CreateUserAPI;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

    @Test(priority = 1)
    public void validateGetUsersAPI() {

        Response response =
                GetUserAPI.getUsers();

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                200);

        String email =
                response.jsonPath()
                .getString("data[0].email");

        System.out.println(email);
    }

    @Test(priority = 2)
    public void validateCreateUser() {

        Response response =
                CreateUserAPI.createUser();

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                201);
    }
}