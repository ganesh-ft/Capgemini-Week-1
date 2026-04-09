package fakeRESTAPI.Users;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetUsersById {
	@Test
	public void getUsers() {
			
		RestAssured.given()
			.pathParam("id", 10)
	        
		// HTTP METHOD
		.when()
			.get("https://fakerestapi.azurewebsites.net/api/v1/Users/{id}")
			
		// RESPONSE
		.then()
			.log().all()
			.assertThat()
				  .statusCode(200)
				  .statusLine(Matchers.containsString("HTTP"))
				  .time(Matchers.lessThan(5000l));
		}
}
