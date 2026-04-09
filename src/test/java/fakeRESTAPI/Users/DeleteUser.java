package fakeRESTAPI.Users;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DeleteUser {
	@Test
	public void deleteUser() {

		RestAssured.given()
			.pathParam("id", 0)
		
		// HTTP METHOD
		.when()
			.delete("https://fakerestapi.azurewebsites.net/api/v1/Users/{id}")
			
		// RESPONSE
		.then()
			.log().all()
			.assertThat()
				  .statusCode(200)
				  .statusLine(Matchers.containsString("HTTP"))
				  .time(Matchers.lessThan(5000l));
	}
}
