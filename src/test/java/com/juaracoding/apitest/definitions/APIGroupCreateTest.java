package com.juaracoding.apitest.definitions;

import org.hamcrest.CoreMatchers;
import org.json.JSONObject;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIGroupCreateTest {
  RequestSpecification requestSpecification;
  Response response;
  ValidatableResponse validatableResponse;

  @Before
  public void setup() {
    RestAssured.baseURI = "http://localhost:8000";
  }

  @Given("Preparing header for create group")
  public void prepareHeader() {
    JSONObject payload = new JSONObject();
    payload.put("title", "Mobil Dinas Java");
    payload.put("origin", "Pemkot DKI Javarta");

    requestSpecification = RestAssured.given()
        .header(
            "Authorization",
            "Token cc5f27d68260c334ebeaa3c48c5a042142f63bea")
        .contentType(ContentType.JSON)
        .body(payload.toString());
  }

  @When("I post data payload to server")
  public void requestToServer() {
    response = requestSpecification.when()
        .post("/catalogs/groups/");
  }

  @Then("I received response 201 from the server")
  public void receivedFromServer() {
    response.then()
        .statusCode(201)
        .statusLine("HTTP/1.1 201 Created")
        .body("id", CoreMatchers.instanceOf(Integer.class))
        .body("title", CoreMatchers.instanceOf(String.class))
        .body("origin", CoreMatchers.instanceOf(String.class))
        .body("created_at", CoreMatchers.instanceOf(String.class))
        .body("updated_at", CoreMatchers.instanceOf(String.class))
        .body("owner", CoreMatchers.instanceOf(Integer.class));
  }
}
