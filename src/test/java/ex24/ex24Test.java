package ex24;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex24Test {

    @Test
        //Same word//
    void Anagram_For_Same_Word() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "note");
        assertTrue(actual);
    }

    @Test

    void Anagram_is_True() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "tone");
        assertTrue(actual);
    }

    @Test

    void NotAnagrams() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("dog", "cat");
        assertFalse(actual);
    }

}