package fakeRESTAPI.Authors;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class CreateAuthor {
	@Test
	public void createAuthor() {
		String body = """
				{
					"id": 20,
					"idBook" : 10,
				    "firstName": "sabari",
				    "lastName": "nathan"
				}
				""";
		RestAssured.given()
			.contentType("application/json")
			.body(body)

// HTTP METHOD
			.when()
				.post("https://fakerestapi.azurewebsites.net/api/v1/authors")
	
// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
