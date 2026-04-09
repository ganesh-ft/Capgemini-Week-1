package petStore;

import io.restassured.RestAssured;

public class DeletePetById {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
		
		// HTTP METHOD
			.when()
				.delete("https://petstore.swagger.io/v2/pet/9223372036854775807")
			
		// RESPONSE
			.then()
					.log().all();
		}
}
