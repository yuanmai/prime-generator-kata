package green.bar.patterns;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameRendererTest {

    @Test
    public void startFromHere() {
        assertEquals("name: John Smith", renderName("John Smith"));
    }

    /*
    Obvious implementation
    Fake it (till you make it)
    Triangulation
     */
    private String renderName(String name) {
        return null;
    }
}
