import com.example.plugins.configureRouting
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;
class AppTest {

    @Test
    fun testMilesKm() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/mtok?miles=2")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("2 miles = 3.2 km", response.bodyAsText())

        response = client.get("/ktom?km=5")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("5 km = 3.125 miles", response.bodyAsText())
    }

    @Test
    fun testKmMeters() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/ktometers?km=9")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("9 km = 9000 meters", response.bodyAsText())

        response = client.get("/meterstokm?meters=7000")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("7000 meters = 7 km", response.bodyAsText())
    }

    @Test
    fun testError() = testApplication {
        application {
            configureRouting()
        }
        var response = client.get("/loh")
        assertEquals(HttpStatusCode.NotFound, response.status)
    }
}