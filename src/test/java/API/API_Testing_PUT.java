package API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Testing_PUT {
  @Test
  public void f() {
	  RestAssured.baseURI = "https://reqres.in/";
	  String body = "{ \"name\": \"morpheus\",  \"job\": \"zion resident\" }";
	  Response res = RestAssured.given().body(body).put("/api/users/2");
	  
	  System.out.println(res.getStatusCode());
	  System.out.println(res.getBody().asString());
	  
	  
  }
}
