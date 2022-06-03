package win.api.qa.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import win.api.qa.testbase.TestBase;

import static io.restassured.RestAssured.given;


public class ProductGetById extends TestBase {


    @Test
    public void getProducts() {
        Response response = given()
                .when()
                .pathParam("id", 1)
                .get("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }


}
