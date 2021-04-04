package events;

import model.Meeting;

public class DeleteMeetingEvent {
    public Meeting meeting;

    public DeleteMeetingEvent(Meeting meeting) {

    }
    public void DeleteMeetingEvent(Meeting meeting) {
        this.meeting = meeting;

    }
}
