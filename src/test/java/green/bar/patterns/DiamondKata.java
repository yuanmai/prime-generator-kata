package green.bar.patterns;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class DiamondKata {

    @Test
    public void startFromHere() {
        assertEquals(
                asList(
                "__A__",
                "_B_B_",
                "C___C",
                "_B_B_",
                "__A__"),
                toDiamond("C"));
    }

    private List<String> toDiamond(String c) {
        return null;
    }


}
