import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciServiceTest {

    @Test
    void shouldReturnZeroForTheFirstPosition() {
        assertEquals(0, FibonacciService.calcular(0));
    }

    @Test
    void shouldReturnOneForTheSecondPosition() {
        assertEquals(1, FibonacciService.calcular(1));
    }

    @Test
    void shouldReturnOneForTheThirdPosition() {
        assertEquals(1, FibonacciService.calcular(2));
    }

    @Test
    void shouldReturnFiveForTheSixthPosition() {
        assertEquals(5, FibonacciService.calcular(5));
    }

    @Test
    void shouldReturnFiftyFiveForTheEleventhPosition() {
        assertEquals(55, FibonacciService.calcular(10));
    }
}
