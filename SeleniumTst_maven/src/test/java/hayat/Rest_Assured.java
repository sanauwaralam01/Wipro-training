package hayat;

// import com.github.dockerjava.transport.DockerHttpClient.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Rest_Assured {
	@Test
	public void getUserTest()
	{
			// get the all value 
			/*given()
			.when()
			.get("https://dummyjson.com/products/")
			.then()
			.log().body()
			.statusCode(200);*/
			
			//get the limited value 
			/*given()
		    .when()
		    .get("https://dummyjson.com/products?limit=10&skip=10&select=title,price,category")
		    .then()
		    .log().body()
		    .statusCode(200);*/
		    //.body("id",equalTo(2));
			
			// Add new value 
			/*Map<String , Object> body = new HashMap<>(); //using map to add new value as a pair 
			body.put("title", "Nokia 1100");
			body.put("price", 1500);
			body.put("title", "Samsung j7");
			body.put("price", 15000);
			given()
			.contentType(ContentType.JSON).body(body)
			.when().post("https://dummyjson.com/products/add")
			.then()
			.log().body()
			.statusCode(201) ;  // use statuscode 201 for created(post)
			//.body("title",equalTo("Nokia 1100"));*/
			
			// TO UPDATE THE DATA
			  String requestBody = "{ \"title\": \"Updated Phone\" }";
			  
		        given()
		            .log().body()
		            .contentType(ContentType.JSON)
		            .body(requestBody)
		        .when()
		            .put("https://dummyjson.com/products/1")
		        .then()
		            .log().body()
		            .statusCode(200);

}

}
