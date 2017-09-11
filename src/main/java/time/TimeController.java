package time;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private static final String template = "The time is, %s!";

    @RequestMapping("/time")
    public Time time() {
        return new Time();
    }
}