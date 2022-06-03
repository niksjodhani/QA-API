package win.api.qa.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import win.api.qa.model.UserPojo;
import win.api.qa.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class ProductPostById extends TestBase {
    @Test
    public void buyProduct(){
        UserPojo userPojo = new UserPojo();
        userPojo.setUser_id(2);
        userPojo.setAmount(3);
        Response response = given()
                .when()
                .pathParam("id",1)
                .body(userPojo)
                .post("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}

