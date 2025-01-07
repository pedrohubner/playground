package br.com.pedrohubner.patternmatching;

public class TypePatternPlayground {
    public static void main(String[] args) {
        final var string = "String";
        final var integer = 1;
        final var unknown = new Object();

        System.out.println(getMessageForTypeInTheOldWay(string));
        System.out.println(getMessageForTypeInTheOldWay(integer));
        System.out.println(getMessageForTypeInTheOldWay(unknown));

        System.out.println(getMessageForTypeInTheNewWay(string));
        System.out.println(getMessageForTypeInTheNewWay(integer));
        System.out.println(getMessageForTypeInTheNewWay(unknown));
    }

    private static String getMessageForTypeInTheOldWay(Object obj) {
        if (obj instanceof String) {
            return "String";
        } else if (obj instanceof Integer) {
            return "Integer";
        } else {
            return "Unknown";
        }
    }

    private static String getMessageForTypeInTheNewWay(Object obj) {
        return switch (obj) {
            case String object -> object + " is a String";
            case Integer object -> object + " is an Integer";
            default -> "Unknown";
        };
    }
}
