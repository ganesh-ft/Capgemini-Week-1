package fakeRESTAPI.Activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.Test;

public class DeleteActivityByID {
	@Test
	public void deleteActivityTest() {
		
			// PRE CONDITION
			given()
				.pathParam("id", 9)
	        
			// HTTP METHOD
			.when()
				.delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/{id}")
			
			// RESPONSE
			.then()
				.log().all()
				.assertThat()
					.statusCode(200)
					.statusLine(containsString("HTTP"))
					.time(lessThan(5000l));
			}
	}

