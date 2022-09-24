package liang;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class WordCombinatorTest {
    WordCombinator wordCombinator;
    @Test
    void setUp(){
        wordCombinator = new WordCombinator();
    }


    @Test
    void generateThreeLetterCharacterCombinationTest() {
        String word = "bathe";
        var combinations = wordCombinator.generateThreeLetterCharacterCombinations(word);
        for(String wrd:combinations) {
            assertEquals(3, wrd.length());
            assertTrue(wrd.matches("\\w"));
        }

    }



}