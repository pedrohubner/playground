package br.com.pedrohubner.string;

public class StringPlayground {
    public static void main(String[] args) {
        final String[] words = {"Palavra", "Outra Palavra"};

        final var joinedString = String.join(", ", words);

        System.out.println(joinedString);

        final var word = "Palavra";

        final var otherJoinedString = String.join(", ", new String[]{word, "teste"});

        System.out.println(otherJoinedString);
    }
}
