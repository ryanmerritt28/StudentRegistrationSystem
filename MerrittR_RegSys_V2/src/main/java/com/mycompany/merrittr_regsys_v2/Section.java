package com.mycompany.merrittr_regsys_v2;

import java.util.ArrayList;
import java.util.List;

public class Section {
    
    private String courseName;
    private String sectionNumber;
    private String days;
    private int credits;
    private String periods;
    private List<Student> enrStu;

    public Section() {}
    
    public Section(String courseName, String sectionNumber, String days, int credits, String periods) {
        this.courseName = courseName;
        this.sectionNumber = sectionNumber;
        this.days = days;
        this.credits = credits;
        this.periods = periods;
        enrStu = new ArrayList<>();
    }

    @Override
    public String toString() {
        return courseName + "     Section: " + sectionNumber + "     Credits: " + credits;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public String getSectionNumber() {
        return sectionNumber;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getDays() {
        return days;
    }

    public String getPeriods() {
        return periods;
    }

    public List<Student> getEnrStu() {
        return enrStu;
    }
    
}
