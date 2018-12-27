package preparatory.refactoring;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void oneToken() {
        assertEquals(1, sum("1"));
    }

    //@Test
    public void twoTokens() {
        assertEquals(3, sum("1,2"));
    }

    private int sum(String commaSeparatedSummands) {
        return Integer.parseInt(commaSeparatedSummands);
    }

    //Stream.of(commaSeparatedSummands) mapToInt sum
}
