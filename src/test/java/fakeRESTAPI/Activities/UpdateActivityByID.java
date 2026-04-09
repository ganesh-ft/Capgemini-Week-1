package fakeRESTAPI.Activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import java.io.File;
import org.testng.annotations.Test;

public class UpdateActivityByID {
	@Test
	public void updateActivityTest() {
		File json_file = new File("./src/test/resources/fakeRestActivities.json");
		
		// PRE CONDITION
		given()
			.contentType("application/json")
			.body(json_file)
			.pathParam("id", 7)
        
		// HTTP METHOD
		.when()
			.put("https://fakerestapi.azurewebsites.net/api/v1/Activities/{id}")
		
		// RESPONSE
		.then()
			.log().all()
			.assertThat()
				.statusCode(200)
				.statusLine(containsString("HTTP"))
				.contentType("application/json")
				.time(lessThan(5000l));
				
		}
}
