package fakeRESTAPI.Authors;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetAuthors {
	@Test
	public void getAuthors() {
		RestAssured.given()

// HTTP METHOD
			.when()
				.get("https://fakerestapi.azurewebsites.net/api/v1/authors")
	
// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
