package tut4;

public class StringModifier {
    public static String ModifyString(String input) throws Exception {
//        if (input == null || input.isEmpty()) {
//            throw new Exception("Input string is empty");
//        }
//
//        String noSpaces = input.replace(" ", "");
//
//        char firstChar = noSpaces.charAt(0);
//        if (!Character.isLetter(firstChar)) {
//            throw new Exception("First character is not a letter");
//        }
//
//        return Character.toUpperCase(firstChar) + noSpaces.substring(1);
        if (input.isEmpty()) {
            throw new Exception("Input string is empty");
        }
        if (Character.isWhitespace(input.charAt(0))) {
            throw new Exception("First character is space");
        }
        if (!Character.isLetter(input.charAt(0))) {
            throw new Exception("First character is not a letter");
        }

        String noSpaces = input.replace(" ", "");
        char firstChar = noSpaces.charAt(0);
        return Character.toUpperCase(firstChar) + noSpaces.substring(1);
    }
}
