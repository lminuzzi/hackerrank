package hackerrank.easy;

import org.junit.jupiter.api.Test;

import static hackerrank.easy.TwoStrings.NO;
import static hackerrank.easy.TwoStrings.YES;
import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {

    private final TwoStrings twoStrings = new TwoStrings();

    @Test
    public void should_return_YES() {
        assertEquals(twoStrings.twoStrings("hello", "world"), YES);
        assertEquals(twoStrings.twoStrings("hell", "world"), YES);
        assertEquals(twoStrings.twoStrings("d", "world"), YES);
        assertEquals(twoStrings.twoStrings("wd", "world"), YES);
        assertEquals(twoStrings.twoStrings("rrr", "world"), YES);
    }

    @Test
    public void should_return_NO() {
        assertEquals(twoStrings.twoStrings("hi", "world"), NO);
        assertEquals(twoStrings.twoStrings("stay", "world"), NO);
        assertEquals(twoStrings.twoStrings("hey", "world"), NO);
        assertEquals(twoStrings.twoStrings("abc", "world"), NO);
    }
}