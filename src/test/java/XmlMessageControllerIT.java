import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import nl.rls.Main;
import nl.rls.ci.controller.XmlMessageController;
import nl.rls.ci.url.BaseURL;
import org.flywaydb.test.FlywayTestExecutionListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Main.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        FlywayTestExecutionListener.class})
@ExtendWith({SpringExtension.class})
public class XmlMessageControllerIT {
    @LocalServerPort
    int randomServerPort;

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "http://localhost:";
    }

    @Test
    public void getById() {
        ValidatableResponse response = given().when().get(RestAssured.baseURI + randomServerPort + BaseURL.BASE_PATH + XmlMessageController.PATH + "/1").then();
        response.assertThat().statusCode(200);
    }
}