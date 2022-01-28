package com.mycompany.merrittr_regsys_v2;

import java.util.ArrayList;
import java.util.List;

public class Student {
   
    protected int id;
    protected String name;
    protected String lname;
    protected List<Section> curEnr;
    protected float fees;

    public Student () {}
    
    public Student(int id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        curEnr = new ArrayList<>();
//        fees = calculateFees();
    }

    public boolean addSection(Section sec) {
        curEnr.add(sec);
        fees = calculateFees();
        return true;
    }

    public boolean dropSection(Section sec) {
        if(curEnr.contains(sec)) {
            curEnr.remove(sec);
            return true;
        }
        fees = calculateFees();
        return false;
    }
    
    public void showSchedule() {
        System.out.println("\nYour schedule is: ");
        for (int j = 0; j < curEnr.size(); j++) {
            System.out.println(curEnr.get(j).getCourseName() + "      Section: " + curEnr.get(j).getSectionNumber());
        }
    }

    public float calculateFees() {
        fees = 0;
        for (int j = 0; j < curEnr.size(); j++) {
            fees += (10*curEnr.get(j).getCredits());
        }
        return fees;
    }

    public float calculateTuition() {
        return 0;
    }

    @Override
    public String toString() {
        String s = "Student Name: " + name + " " + lname + "\nStudent ID: " + id;
        return s;
    }
    
    public float calcTuitionFees() {
     
        float tuitionFees = calculateTuition() + calculateFees();
        return tuitionFees;
        
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public List<Section> getCurEnr() {
        return curEnr;
    }

    public float getFees() {
        return fees;
    }
}
