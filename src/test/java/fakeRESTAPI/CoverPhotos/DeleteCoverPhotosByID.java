package fakeRESTAPI.CoverPhotos;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.Test;

public class DeleteCoverPhotosByID {
	@Test
	public void deletePhotosTest() {
		
		// PRE CONDITION
		given()
			.pathParam("id", 177)
        
		// HTTP METHOD
		.when()
			.get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/{id}")
		
		// RESPONSE
		.then()
			.log().all()
			.assertThat()
				.statusCode(200)
				.statusLine(containsString("HTTP"))
				.time(lessThan(5000l));
					
	}
}
