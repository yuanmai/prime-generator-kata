package green.bar.patterns;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsKata {

    @Test
    public void startFromHere() {
        assertEquals(
                asList("", "", "", ""),
                toRoman(0));
        assertEquals(
                asList("M", "CD", "XL", "IV"),
                toRoman(1444));
    }

    private List<String> toRoman(int number) {
        return null;
    }
}
