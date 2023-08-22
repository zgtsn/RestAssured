import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class _01_ZippoTest {

    @Test
    public void test() {
        given().
                //hazırlık işlemlerini yapacağız(token,send body, parametreler)

                        when().
                //linki ve method veriyoruz.


                        that();
        //assertionve verileri ele alma, extract

    }

    @Test
    public void statusCodeTest() {
        given()
                //hazırlık işlemlerini yapacağız(token,send body, parametreler)

                .when()
                .get("http://api.zippopotam.us/us/90210")

                .then()
                .log().body() //log.All() bütün responsu gösterir
                .statusCode(200); //statu kontrol

        //assertionve verileri ele alma, extract

    }
}
