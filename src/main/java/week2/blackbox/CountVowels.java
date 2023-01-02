package week2.blackbox;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u', 'i'));

    public int countVowels(String text) {
        int vowelCount = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    boolean isVowel(char c) {

        return VOWELS.contains(c);
    }
}
