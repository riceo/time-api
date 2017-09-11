package time;

import org.junit.Test;
import static org.junit.Assert.*;

public class timeTest {

    @Test
    public void testTime() {
        Time time = new Time();

        String result = time.getTime();

        assertNotNull(result);

    }
}