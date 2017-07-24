package rajo0020.student.umu.se.mailapplication;

/**
 * Created by Dator on 2017-07-19.
 */

public class Email {
    private String title;
    private String date;
    private String time;
    private String text;

    public Email(String title,String date,String time,String text) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.text = text;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
