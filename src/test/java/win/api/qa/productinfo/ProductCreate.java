package win.api.qa.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import win.api.qa.model.UserPojo;
import win.api.qa.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class ProductCreate extends TestBase {


    @Test
    public void postCreateProducts() {
        UserPojo userPojo = new UserPojo();
        userPojo.setName("Lime Curd Check");
        userPojo.setAvailable(50);
        Response response=given()
                .when()
                .body(userPojo)
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);

    }
}