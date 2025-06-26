package restassured;

import java.util.Map;

import io.restassured.RestAssured;
import java.util.Map;

import org.apache.poi.openxml4j.opc.internal.ContentType;

public class Base {

    

    public BaseAPI(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

    public Response get(String endpoint, Map<String, String> headers, Map<String, ?> queryParams) {
        return RestAssured
                .given()
                    .headers(headers)
                    .queryParams(queryParams)
                .when()
                    .get(endpoint)
                .then()
                    .extract().response();
    }

    public Response post(String endpoint, Map<String, String> headers, Object body) {
        return RestAssured
                .given()
                    .headers(headers)
                    .contentType(ContentType.JSON)
                    .body(body)
                .when()
                    .post(endpoint)
                .then()
                    .extract().response();
    }

    public Response put(String endpoint, Map<String, String> headers, Object body) {
        return RestAssured
                .given()
                    .headers(headers)
                    .contentType(ContentType.JSON)
                    .body(body)
                .when()
                    .put(endpoint)
                .then()
                    .extract().response();
    }

    public Response patch(String endpoint, Map<String, String> headers, Object body) {
        return RestAssured
                .given()
                    .headers(headers)
                    .contentType(ContentType.JSON)
                    .body(body)
                .when()
                    .patch(endpoint)
                .then()
                    .extract().response();
    }

    public Response delete(String endpoint, Map<String, String> headers) {
        return RestAssured
                .given()
                    .headers(headers)
                .when()
                    .delete(endpoint)
                .then()
                    .extract().response();
    }
    
}
