package green.bar.patterns;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DateKata {

    @Test
    public void startFromHere() {
        assertEquals("2018-07-12", format(LocalDate.of(2018, 7 ,12)));
    }

    private String format(LocalDate date) {
        return null;
    }
}
