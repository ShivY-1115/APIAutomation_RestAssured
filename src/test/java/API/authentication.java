package API;

import io.restassured.RestAssured;

public class authentication {
	
	public static void main(String[] args) {
		
		  RestAssured.baseURI = "https://reqres.in/";
		  
		  RestAssured.given().auth().digest(null, null);
		  

		
	}
	

}
