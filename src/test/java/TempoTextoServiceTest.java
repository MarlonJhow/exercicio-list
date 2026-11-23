import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempoTextoServiceTest {

    @Test
    void shouldReturnZeroForZeroHoursAndMinutes() {
        assertEquals(0L, TempoTextoService.converterParaSegundos("0h0min"));
    }

    @Test
    void shouldConvertOneMinuteToSeconds() {
        assertEquals(60L, TempoTextoService.converterParaSegundos("0h1min"));
    }

    @Test
    void shouldConvertOneHourToSeconds() {
        assertEquals(3600L, TempoTextoService.converterParaSegundos("1h0min"));
    }

    @Test
    void shouldConvertHoursAndMinutesToSeconds() {
        assertEquals(5400L, TempoTextoService.converterParaSegundos("1h30min"));
    }

    @Test
    void shouldConvertMultipleHoursAndMinutesToSeconds() {
        assertEquals(9900L, TempoTextoService.converterParaSegundos("2h45min"));
    }

    @Test
    void shouldReadHoursAndMinutesWithMultipleDigits() {
        assertEquals(45300L, TempoTextoService.converterParaSegundos("12h35min"));
    }

    @Test
    void shouldAcceptMoreThanFiftyNineMinutes() {
        assertEquals(9000L, TempoTextoService.converterParaSegundos("1h90min"));
    }
}
