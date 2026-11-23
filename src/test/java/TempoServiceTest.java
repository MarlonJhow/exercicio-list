import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempoServiceTest {

    @Test
    void shouldReturnZeroForZeroMinutesAndHours() {
        assertEquals(0L, TempoService.converterParaSegundos(0, 0));
    }

    @Test
    void shouldConvertOneMinuteToSeconds() {
        assertEquals(60L, TempoService.converterParaSegundos(1, 0));
    }

    @Test
    void shouldConvertOneHourToSeconds() {
        assertEquals(3600L, TempoService.converterParaSegundos(0, 1));
    }

    @Test
    void shouldConvertMultipleMinutesToSeconds() {
        assertEquals(900L, TempoService.converterParaSegundos(15, 0));
    }

    @Test
    void shouldConvertMultipleHoursToSeconds() {
        assertEquals(7200L, TempoService.converterParaSegundos(0, 2));
    }

    @Test
    void shouldCombineMinutesAndHoursInParameterOrder() {
        assertEquals(5400L, TempoService.converterParaSegundos(30, 1));
    }

    @Test
    void shouldAcceptMoreThanFiftyNineMinutes() {
        assertEquals(9000L, TempoService.converterParaSegundos(90, 1));
    }
}
