package time;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time {

    private final String time;

    public Time() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        this.time = dateFormat.format(date);
    }

    public String getTime() {
        return time;
    }
}