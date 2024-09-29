import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.RawText;
import org.example.Woops;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class MyTest {

    private final static String postmanEcho = "https://postman-echo.com";

    @Test
    public void checkGetArgs() {
        RestAssured.baseURI = postmanEcho;


        given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(Woops.orderReq)
                .get("/get")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void checkRawText() {
        RestAssured.baseURI = postmanEcho;

        given()
                .contentType("text/plain")
                .body(RawText.rawText)
                .log().all()
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .log().all()
                .body("data", equalTo(RawText.rawText));
    }

    @Test
    public void checkFormData() {
        RestAssured.baseURI = postmanEcho;

        given()
                .contentType("application/json")
                .body(Woops.orderReq)
                .log().all()
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .log().all()
                .body("data.foo1", equalTo("bar1"))
                .body("data.foo2", equalTo("bar2"));
    }

    @Test
    public void checkPut() {
        RestAssured.baseURI = postmanEcho;

        String requestBody = "This is expected to be sent back as part of response body.";

        Response response =
                given()
                        .queryParam("hand", "wave")
                        .header("Content-Type", "text/plain")
                        .body(requestBody)
                        .when()
                        .put("/put")
                        .then()
                        .statusCode(200)
                        .body("data", equalTo(requestBody))
                        .extract()
                        .response();

        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }

    @Test
    public void checkPath() {
        RestAssured.baseURI = postmanEcho;

        String requestBody = "This is expected to be sent back as part of response body.";

        Response response =
                given()
                        .contentType("text/plain")
                        .body(requestBody)
                        .log().all()
                        .when()
                        .patch("/patch")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .body("data", equalTo(requestBody))
                        .extract()
                        .response();

        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }

    @Test
    public void checkDeleteText() {
        RestAssured.baseURI = postmanEcho;

        String requestBody = "This is expected to be sent back as part of response body.";

        Response response =
                given()
                        .contentType("text/plain")
                        .body(requestBody)
                        .log().all()
                        .when()
                        .delete("/delete")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .body("data", equalTo(requestBody))
                        .extract()
                        .response();

        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }
}
