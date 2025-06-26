package API;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Query_Path_parameters {
	
	public static void main(String[] args) {
		
		  RestAssured.baseURI = "https://reqres.in/";
		  
		 Response res = RestAssured.given().queryParam("page", 2)
		  .header("x-api-key", "reqres-free-v1").get("api/users");
		 
		  //System.out.println(res.getBody().asString());
		  
		  Response res1 = RestAssured.given()
				  .header("x-api-key", "reqres-free-v1").get("api/users/data");
		  
		 List<Object> list1 = res1.jsonPath().getList("data");
		  System.out.println(res.getBody().asString());
		  System.out.println(list1);


	}

}
