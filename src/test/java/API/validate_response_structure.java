package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;


public class validate_response_structure {
	
	public static void main(String[] args) {
		
		  RestAssured.baseURI = "https://reqres.in/";
		  
		 // 
		  
		  Response rws = RestAssured.given().get("api/users?page=2");
		  Response response = RestAssured.given().header("x-api-key", "reqres-free-v1").
				  get("https://reqres.in/api/users");
		  String email = response.jsonPath().getString("data[1].email");
		  System.out.println(email);
		  System.out.println(response.getBody().asString());
		  
		  
		  //response structure validation
		  RestAssured.given().header("x-api-key", "reqres-free-v1").when().get("api/users?page=2")
		  .then().body("data[1].email", containsString("@"))
		  .body("page", equalTo(2)).body("data[0].avatar", containsString(".jpg"));
		  
		  //count of data inside the data
		  int count = response.jsonPath().getList("data").size();	  
		  System.out.println(count);
		  
		  String user_name = response.jsonPath().getString("data["+(count-1)+"].first_name");
		  System.out.println(user_name);
		  
		  
		  //rws.body("data[0][1]");
		  
		  
		  //.body("data[0][1]", contains("@"));

		
	}

}
