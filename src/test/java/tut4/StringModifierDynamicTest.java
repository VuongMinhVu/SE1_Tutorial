package tut4;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class StringModifierDynamicTest {

    @TestFactory
    Collection<DynamicTest> dynamicTestsForModifyString() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Remove spaces and capitalize",
                        () -> assertEquals("Helloworld", StringModifier.ModifyString("hello world"))
                ),
                DynamicTest.dynamicTest("Already capitalized",
                        () -> assertEquals("JavaCode", StringModifier.ModifyString("Java Code"))
                ),
                DynamicTest.dynamicTest("Throw exception when first char is not letter",
                        () -> {
                            Exception ex = assertThrows(Exception.class, () ->
                                    StringModifier.ModifyString("123hello"));
                            assertEquals("First character is not a letter", ex.getMessage());
                        }
                ),
                DynamicTest.dynamicTest("Throw exception when string is empty",
                        () -> {
                            Exception ex = assertThrows(Exception.class, () ->
                                    StringModifier.ModifyString(""));
                            assertEquals("Input string is empty", ex.getMessage());
                        }
                )
        );
    }
}
