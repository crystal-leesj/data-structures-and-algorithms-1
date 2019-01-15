package reapeatedWords;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void reapeatedWords() {
        RepeatedWord classToTest = new RepeatedWord();
        String string = "I am string am I";
        String actual = "am";
        String expected = classToTest.repeatedWords(string);
        assertEquals(expected,actual);
        System.out.println(expected);
    }

    @Test
    public void repeatedWordsNoRepeats() {
        RepeatedWord classToTest = new RepeatedWord();
        String string = "I am string";
        String actual = "no repeated words";
        String expected = classToTest.repeatedWords(string);
        assertEquals(expected,actual);
        System.out.println(expected);
    }

    @Test
    public void repeatedWordsNoRepeatsManyRepeats() {
        RepeatedWord classToTest = new RepeatedWord();
        String string = "I am string string String string ";
        String actual = "string";
        String expected = classToTest.repeatedWords(string);
        assertEquals(expected,actual);
        System.out.println(expected);
    }

    @Test
    public void repeatedWordsEquals() {
        RepeatedWord classToTest = new RepeatedWord();
        String string = "no Zahra no";
        assertTrue(classToTest.repeatedWords(string).equals("no"));

    }
}