package dk.sdu.student.njako21.common.events;

import dk.sdu.student.njako21.common.data.Entity;
import java.io.Serializable;

/**
 *
 * @author Mads
 */
public class Event implements Serializable{
    private final Entity source;

    public Event(Entity source) {
        this.source = source;
    }

    public Entity getSource() {
        return source;
    }
}
