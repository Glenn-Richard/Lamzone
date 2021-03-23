package model;

public class Meeting {
    /*photo*/
    private String AvatarUrl;


    /* Heures du rendez-vous */
    private int hours;


    /* Minutes du rendez-vous*/
    private  int minutes;


    /* Lieux du rendez-vous*/
    private String location;


    /*Sujet du rendez-vous*/
    private String subject;


    /*Participant du rendez-vous (adresse email)*/
    private  String email;


    /* Constructeur*/
   public Meeting(int hours, int minutes, String location, String subject, String email){
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return AvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        AvatarUrl = avatarUrl;
    }
}
