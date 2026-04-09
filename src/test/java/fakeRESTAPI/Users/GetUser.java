package fakeRESTAPI.Users;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUser {

	@Test
	public void getUsers() {
		
		RestAssured.given()
		        
		// HTTP METHOD
			.when()
				.get("https://fakerestapi.azurewebsites.net/api/v1/Users")
			
		// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
