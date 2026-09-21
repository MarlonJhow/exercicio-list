import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromoServiceTest {

    @Test
    void shouldReturnTrueForPalindromeWord() {
        assertTrue(PalindromoService.verificar("arara"));
    }

    @Test
    void shouldReturnTrueForPalindromeWordWithEvenNumberOfLetters() {
        assertTrue(PalindromoService.verificar("osso"));
    }

    @Test
    void shouldReturnFalseForNonPalindromeWord() {
        assertFalse(PalindromoService.verificar("casa"));
    }

    @Test
    void shouldReturnTrueForWordWithOneLetter() {
        assertTrue(PalindromoService.verificar("a"));
    }
}
