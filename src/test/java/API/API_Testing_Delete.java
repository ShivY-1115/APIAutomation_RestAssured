package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Testing_Delete {
	
	public static void main(String[] args) 
	{
		
		  RestAssured.baseURI = "https://reqres.in/";
		  Response res = RestAssured.given().header("x-api-key", "reqres-free-v1").get("api/users");
		  
		  System.out.println(res.getBody().asString());
		  
		  RestAssured.given().header("x-api-key", "reqres-free-v1").delete("api/users/1");
		  
Response res1 = RestAssured.given().header("x-api-key", "reqres-free-v1").get("api/users");
		  
		  System.out.println(res1.getBody().asString());
		  
		  
		  
		  

		
		
	}

}
