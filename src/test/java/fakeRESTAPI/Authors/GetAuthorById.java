package fakeRESTAPI.Authors;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetAuthorById {
	@Test
	public void getAuthorById() {
		RestAssured.given()
			.pathParam("id", 204)

// HTTP METHOD
			.when()
				.get("https://fakerestapi.azurewebsites.net/api/v1/authors/{id}")
	
// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
