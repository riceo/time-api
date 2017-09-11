package time;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class TimeController {

    private static final String template = "The time is, %s!";

    @CrossOrigin()
    @RequestMapping("/time")
    public Time time() {
        return new Time();
    }
}