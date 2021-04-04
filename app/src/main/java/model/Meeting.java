package model;

import java.util.List;

public class Meeting {
    /*photo*/
    private String AvatarUrl;


    private int id;


    /* Heures du rendez-vous */
    private int hours;


    /* Minutes du rendez-vous*/
    private  int minutes;


    /* Lieux du rendez-vous*/
    private String location;


    /*Sujet du rendez-vous*/
    private String subject;


    /*Participant du rendez-vous (adresse email)*/
    private List<String> email;


    /* Constructeur*/
   public Meeting(String avatarUrl, int id,  int hours, int minutes, String location, String subject, List email){
       this.AvatarUrl = avatarUrl;
       this.id = id;
       this.hours = hours;
       this.minutes = minutes;
       this.location = location;
       this.subject = subject;
       this.email = email;
   }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List getEmail() {
        return email;
    }

    public void setEmail(List email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return AvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        AvatarUrl = avatarUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
