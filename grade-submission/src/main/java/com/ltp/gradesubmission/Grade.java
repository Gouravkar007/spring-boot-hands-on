package com.ltp.gradesubmission;

public class Grade {
    private String name;
    private String subject;
    private String Score;


    public Grade(String name, String subject, String Score) {
        this.name = name;
        this.subject = subject;
        this.Score = Score;
    }

    public Grade() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }


}
