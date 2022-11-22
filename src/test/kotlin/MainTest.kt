import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "comum", "xt1234"), "Welcome.")
        Assertions.assertEquals(portaria(20, "comum", "1234"), "Negado.")
        Assertions.assertEquals(portaria(20, "premium", "1234"), "Negado.")
        Assertions.assertEquals(portaria(20, "premium", "xl1234"), "Welcome.")
        Assertions.assertEquals(portaria(20, "luxo", "xl1234"), "Welcome.")
    }
}