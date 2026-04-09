package petStore;

import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class UploadImageByForm {
	@Test
	public void uploadImageTest() {
		
		File picture = new File("C:/Users/Manish/Pictures/Wallpapers/Mountain_light.png");
		// PRE CONDITION
		RestAssured.given()
			.pathParam("petId", 576960)
			.multiPart("file", picture) //use multipart for file uploads
		
		// HTTP METHOD
			.when()
				.post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
			
		// RESPONSE
			.then()
				.statusCode(200)
					.log().all();
	}
}
