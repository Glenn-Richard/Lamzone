package api;

import java.util.List;

import model.Meeting;

public interface ApiMeetingService {
    public List<Meeting> getMeetings();

    public void addMeeting(Meeting meeting);

    public void deleteMeeting(Meeting meeting);

    public int locationIs(Meeting meeting);

    public void dateInOrder();
}
