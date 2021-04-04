package api;

import java.util.List;

import model.Meeting;

public class FakeApiService implements ApiMeetingService {

    List<Meeting> meetings = new FakeApiServiceGenerator().generateMeetings();

    @Override
    public List<Meeting> getMeetings() {
        return meetings;
    }
    @Override
    public void addMeeting(Meeting meeting){
        meetings.add(meeting);
    }
    @Override
    public void deleteMeeting(Meeting meeting){
        meetings.remove(meeting);
    }
    @Override
    public int locationIs(Meeting meeting){
        String location = meeting.getLocation();
        switch (location){
            case "Réunion A":
                return 0;

            case "Réunion B":
                return 1;

            case "Réunion C":
                return 2;

            default:
                return 0;
        }
    }
    @Override
    public void dateInOrder(){
//        List<Meeting> byDate = Arrays
        for (int i=0;i<meetings.size();i++){
            if(meetings.get(i).getHours()>meetings.get(i++).getHours()){

//            }else if(meetings.get(i).getHours()==meetings.get(i++).getHours()){
//                if (meetings.get(i).getMinutes()>meetings.get(i++).getMinutes())
            }
        }
    }
}
