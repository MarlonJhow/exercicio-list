import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnoBissextoServiceTest {

    @Test
    void shouldReturnTrueForLeapYearDivisibleBy4() {
        assertTrue(AnoBissextoService.analisar(2024));
    }

    @Test
    void shouldReturnFalseForYearNotDivisibleBy4() {
        assertFalse(AnoBissextoService.analisar(2023));
    }

    @Test
    void shouldReturnFalseForCenturyYearNotDivisibleBy400() {
        assertFalse(AnoBissextoService.analisar(1900));
    }

    @Test
    void shouldReturnTrueForCenturyYearDivisibleBy400() {
        assertTrue(AnoBissextoService.analisar(2000));
    }

    @Test
    void shouldReturnFalseForYearNotDivisibleBy4EvenIfItIsNotACentury() {
        assertFalse(AnoBissextoService.analisar(2025));
    }

}