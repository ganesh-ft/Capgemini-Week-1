package fakeRESTAPI.CoverPhotos;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;
import java.io.File;
import org.testng.annotations.Test;

public class CreateCoverPhotosByID {
	@Test
	public void createPhotosTest() {
		File json_file = new File("./src/test/resources/fakeRestCoverPhotos.json");
		
		// PRE CONDITION
		given()
			.contentType("application/json")
			.body(json_file)
			
		// HTTP METHOD
		.when()
			.post("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos")
		
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
