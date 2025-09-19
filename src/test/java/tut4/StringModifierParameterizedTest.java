package tut4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringModifierParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"hello world", "java code", "hanoi university"})
    void testModifyString_RemovesSpacesAndCapitalizes(String input) throws Exception {
        String result = StringModifier.ModifyString(input);
        //no space
        assertFalse(result.contains(" "));
        // first char capitalized
        assertTrue(Character.isUpperCase(result.charAt(0)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123hello", "!abc"})
    void testModifyString_FirstCharNotLetter(String input) {
        Exception ex = assertThrows(Exception.class, () -> StringModifier.ModifyString(input));
        assertEquals("First character is not a letter", ex.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void testModifyString_EmptyString(String input) {
        Exception ex = assertThrows(Exception.class, () -> StringModifier.ModifyString(input));
        assertEquals("Input string is empty", ex.getMessage());
    }
}
