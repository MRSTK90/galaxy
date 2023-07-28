package kr.co.galaxy.user.ui;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import kr.co.galaxy.user.application.RoleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RoleControllerTest {

    @LocalServerPort
    int port;

    @Autowired
    RoleService roleService;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    void findRole() {
        ExtractableResponse<Response> response = RestAssured.given().log().all()
                .pathParams("id", 1)
                .when().get("/user/roles/{id}")
                .then().log().all()
                .extract();

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.jsonPath().getString("id")).isEqualTo("1");
    }

    @Test
    void findByName() {
    }
}