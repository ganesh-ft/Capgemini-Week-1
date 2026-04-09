package petStore;

import io.restassured.RestAssured;

public class UpdatePetByID {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body("{\"id\": 9223372036854775807,\r\n"
        		+ "  \"category\": {\r\n"
        		+ "    \"id\": 7,\r\n"
        		+ "    \"name\": \"bond\"\r\n"
        		+ "  },\r\n"
        		+ "  \"name\": \"doggie\",\r\n"
        		+ "  \"photoUrls\": [\r\n"
        		+ "    \"string\"\r\n"
        		+ "  ],\r\n"
        		+ "  \"tags\": [\r\n"
        		+ "    {\r\n"
        		+ "      \"id\": 7,\r\n"
        		+ "      \"name\": \"doggiebond\"\r\n"
        		+ "    }\r\n"
        		+ "  ],\r\n"
        		+ "  \"status\": \"available\"}")
		// HTTP METHOD
			.when()
				.put("https://petstore.swagger.io/v2/pet")
			
		// RESPONSE
			.then()
				.statusCode(200)
					.log().all();
		}
}
