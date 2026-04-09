package fakeRESTAPI.Authors;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DeleteAuthor {
	@Test
	public void deleteAuthors() {
		RestAssured.given()
		.pathParam("id", 20)

			// HTTP METHOD
			.when()
				.delete("https://fakerestapi.azurewebsites.net/api/v1/authors/{id}")
	
			// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(204)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
