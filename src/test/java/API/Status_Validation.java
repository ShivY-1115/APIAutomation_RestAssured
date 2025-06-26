package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Status_Validation {
	
	public static void main(String[] args) {
		
		 RestAssured.baseURI = "https://reqres.in/api/";
		 
		 RestAssured.given().when().
		 get("users?page=2").then().
		 statusCode(200);
		 
		 long time = RestAssured.given().get("users?page=2").getTime();
		
		
	}

	
}
