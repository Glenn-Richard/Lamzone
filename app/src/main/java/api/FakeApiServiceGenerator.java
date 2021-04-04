package api;

import java.util.Arrays;
import java.util.List;

import model.Meeting;


public class FakeApiServiceGenerator {

    public static List<String> listOfEmails = Arrays.asList(
            "lucie.1@gmail.com",
            "adam-pro@yahoo.fr",
            "ericcroc@gmail.com",
            "arnoldchampa@hotmail.fr",
            "clara921@gmail.com"

    );


    public List<Meeting> generateMeetings(){return MEETINGS ;}
    public static List<Meeting> MEETINGS = Arrays.asList(
        new Meeting("",000,15,20,"Réunion A","Production",listOfEmails),
        new Meeting("",001,10,00,"Réunion B","Production",listOfEmails),
        new Meeting("",002,8,30,"Réunion A","Production",listOfEmails),
        new Meeting("",003,17,15,"Réunion C","Production",listOfEmails),
        new Meeting("",004,15,00,"Réunion B","Production",listOfEmails)
    );


}
