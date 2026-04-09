package fakeRESTAPI.Activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.Test;

public class GetAllActivities {
	@Test
	public void getActivitiesTest() {
		
		// PRE CONDITION
		given()
        
		// HTTP METHOD
		.when()
			.get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		
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

