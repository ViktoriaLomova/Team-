package DBObjects;

import java.util.Arrays;
import java.util.Objects;

public class Event {
    Integer eventId;
    String name;
    Byte[] eventPicture;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getEventPicture() {
        return eventPicture;
    }

    public void setEventPicture(Byte[] eventPicture) {
        this.eventPicture = eventPicture;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(getEventId(), event.getEventId()) && Objects.equals(getName(), event.getName()) && Objects.deepEquals(getEventPicture(), event.getEventPicture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventId(), getName(), Arrays.hashCode(getEventPicture()));
    }
}
