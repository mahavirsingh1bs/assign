package d1.core;

import java.util.Date;
import java.util.UUID;
import java.io.Serializable;

public class Event implements Serializable {
    private UUID id;
    private Date date;
    private String name;
    private String text;

    public Event() {
    }

    public Event(UUID id, Date date, String name, String text) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Event #" +
                id + " - "+
                (date != null ? date.toString() : "(no date)") +
                " - "
                + (text != null ? text : "");
    }
}
