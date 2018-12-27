package green.bar.patterns;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ToCharacterTest {

    @Test
    public void startFromHere() {
        assertEquals("a,b,c", toCharacter(Arrays.asList(1,2,3)));
    }

    private String toCharacter(List<Integer> asList) {
        return null;
    }
}
