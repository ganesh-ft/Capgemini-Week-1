package fakeRESTAPI.CoverPhotos;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;
import java.io.File;
import org.testng.annotations.Test;

public class UpdateCoverPhotosByID {
	@Test
	public void updatePhotosTest() {
		File json_file = new File("./src/test/resources/fakeRestCoverPhotos.json");
		
		// PRE CONDITION
		given()
			.pathParam("id", 177)
			.contentType("application/json")
			.body(json_file)
			
		// HTTP METHOD
		.when()
			.put("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/{id}")
		
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
