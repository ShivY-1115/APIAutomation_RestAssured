package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API_Testing_POST {
	
	public static void main(String[] args) 
	{
		
		  RestAssured.baseURI = "https://reqres.in/";
		  
		  String sss = "{\"email\": \"eve.holt@reqres.in\",  \"password\": \"pistol\"}";
		  
		  Response res = RestAssured.given().header("Content-Type", "application/json").
				  header("x-api-key", "reqres-free-v1").body(sss).post("api/register");
		  
		  System.out.println(res.getStatusCode());
			
		  System.out.println(res.getBody().asString());
		  
		  Response res1 = RestAssured.given().contentType(ContentType.JSON).body(sss).get();
		

		
	}

}
