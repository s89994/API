import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstTest {

    private String weatherDetails = "http://restapi.demoqa.com/utilities/weather/city";
    private String city = "/Vilnius";

    private String customerRegister = "http://restapi.demoqa.com/customer";
    private String registerEndPoint = "/register";

    @Test
    public void firstTestGET() {

        // Setting base url for request.
        RestAssured.baseURI = weatherDetails;

        given().get(city).then().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType("application/json");
    }

    @Test
    public void secondTestPOST(){

        RestAssured.baseURI = customerRegister;

        RestAssured.baseURI = customerRegister;
        given()
                .param("FirstName","JohnXYZ")
                .param("LastName","XYZJohn")
                .param("UserName","JohnXYZ")
                .param("Password","JohnXYZxyx")
                .param("Email","JohnXYZ@gmail.com")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .post(registerEndPoint)
                .then().statusCode(400);
    }

}
