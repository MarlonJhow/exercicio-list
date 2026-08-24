import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(10, CalculadoraService.calcular(5, 5, "+"));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(2, CalculadoraService.calcular(5, 3, "-"));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(15, CalculadoraService.calcular(5, 3, "*"));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2, CalculadoraService.calcular(6, 3, "/"));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(-5, CalculadoraService.calcular(5, 10, "-"));
    }

}