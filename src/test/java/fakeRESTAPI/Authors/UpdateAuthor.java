package fakeRESTAPI.Authors;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class UpdateAuthor {
	@Test
	public void updateAuthor() {
		String body = """
				{
					"id": 204,
				    "firstName": "sabari",
				    "lastName": "nathan"
				}
				""";
		RestAssured.given()
			.contentType("application/json")
			.pathParam("id", 204)
			.body(body)

// HTTP METHOD
			.when()
				.put("https://fakerestapi.azurewebsites.net/api/v1/authors/{id}")
	
// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
