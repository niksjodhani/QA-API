package win.api.qa.productinfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import win.api.qa.testbase.TestBase;

import static io.restassured.RestAssured.given;


public class ProductsGet extends TestBase {


    @Test
    public void getProducts(){
        Response response = given()
                .when()
                .get("/products");
        response.prettyPrint();
        response.then().statusCode(200);

    }


}
