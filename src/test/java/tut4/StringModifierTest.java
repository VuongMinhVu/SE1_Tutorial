package tut4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringModifierTest {

    @Test
    void testModifyString_RemovesSpacesAndCapitalizes() throws Exception {
        String input = "hello world";
        String expected = "Helloworld";
        assertEquals(expected, StringModifier.ModifyString(input));
    }

    @Test
    void testModifyString_FirstCharNotLetter() {
        String input = "123hello";
        Exception exception = assertThrows(Exception.class, () -> {
            StringModifier.ModifyString(input);
        });
        assertEquals("First character is not a letter", exception.getMessage());
    }

    @Test
    void testModifyString_EmptyString() {
        String input = "";
        Exception exception = assertThrows(Exception.class, () -> {
            StringModifier.ModifyString(input);
        });
        assertEquals("Input string is empty", exception.getMessage());
    }

    @Test
    void testModifyString_AlreadyCapitalized() throws Exception {
        String input = "Java Code";
        String expected = "JavaCode";
        assertEquals(expected, StringModifier.ModifyString(input));
    }
    @Test
    void testModifyString_FirstIsSpace() throws Exception {
        String input = " Hanu University";
        Exception exception = assertThrows(Exception.class, () ->{
            StringModifier.ModifyString(input);
        });
        assertEquals("First character is space", exception.getMessage());
    }
}
