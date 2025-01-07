package br.com.pedrohubner.patternmatching;

public class ParenthesizedPatternPlayground {
    public static void main(String[] args) {
        final var string = "String";
        final var otherString = "Other string";
        final var emptyString = "";
        String nullString = null;

        System.out.println(getMessageForTypeInTheOldWay(string));
        System.out.println(getMessageForTypeInTheOldWay(otherString));
        System.out.println(getMessageForTypeInTheOldWay(emptyString));
        System.out.println(getMessageForTypeInTheOldWay(nullString));

        System.out.println(getMessageForTypeInTheNewWay(string));
        System.out.println(getMessageForTypeInTheNewWay(otherString));
        System.out.println(getMessageForTypeInTheNewWay(emptyString));
        System.out.println(getMessageForTypeInTheNewWay(nullString));
    }

    private static String getMessageForTypeInTheOldWay(Object obj) {
        if (obj instanceof String string) {
            if (string.isEmpty()) {
                return "String is empty";
            } else if (string.length() == 6 && string.startsWith("S")) {
                return "string has 5 characters";
            } else {
                return "String is not empty";
            }
        } else if (obj == null) {
            return "Null";
        } else {
            return "Unknown";
        }
    }

    private static String getMessageForTypeInTheNewWay(Object obj) {
        return switch (obj) {
            case String s when stringIsEmpty(s) -> "String is empty";
            case String s when stringHas5CharactersAndFirstLetterIsCapital(s) -> "string has 5 characters";
            case String s when stringIsNotEmpty(s) -> "String is not empty";
            case null -> "Null";
            default -> "Unknown";
        };
    }

    private static boolean stringHas5CharactersAndFirstLetterIsCapital(String s) {
        return !stringIsEmpty(s) && s.length() == 6 && s.startsWith("S");
    }

    private static boolean stringIsNotEmpty(String s) {
        return !stringIsEmpty(s);
    }

    private static boolean stringIsEmpty(String s) {
        return s.isEmpty();
    }
}
