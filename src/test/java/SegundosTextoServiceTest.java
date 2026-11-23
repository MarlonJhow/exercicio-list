import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SegundosTextoServiceTest {

    @Test
    void shouldFormatZeroSeconds() {
        assertEquals("0h0min0s", SegundosTextoService.converterParaTexto(0L));
    }

    @Test
    void shouldFormatSecondsOnly() {
        assertEquals("0h0min59s", SegundosTextoService.converterParaTexto(59L));
    }

    @Test
    void shouldFormatExactlyOneMinute() {
        assertEquals("0h1min0s", SegundosTextoService.converterParaTexto(60L));
    }

    @Test
    void shouldFormatMinutesAndSeconds() {
        assertEquals("0h1min30s", SegundosTextoService.converterParaTexto(90L));
    }

    @Test
    void shouldFormatLastSecondBeforeOneHour() {
        assertEquals("0h59min59s", SegundosTextoService.converterParaTexto(3599L));
    }

    @Test
    void shouldFormatExactlyOneHour() {
        assertEquals("1h0min0s", SegundosTextoService.converterParaTexto(3600L));
    }

    @Test
    void shouldFormatHoursMinutesAndSeconds() {
        assertEquals("1h1min1s", SegundosTextoService.converterParaTexto(3661L));
    }

    @Test
    void shouldFormatHoursAndMinutes() {
        assertEquals("1h30min0s", SegundosTextoService.converterParaTexto(5400L));
    }

    @Test
    void shouldKeepTotalHoursBeyondOneDay() {
        assertEquals("25h1min1s", SegundosTextoService.converterParaTexto(90061L));
    }
}
