package com.mycompany.merrittr_regsys_v2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Student s = new InternationalStudent(123, "John", "Doe");
        Section busProg = new Section("Business Programming", "12345", "T/R", 2, "3-4");
        Section projMan = new Section("Project Management", "67890", "T/R", 2, "5-6");

        System.out.println(s.toString());
        s.addSection(busProg);
        s.addSection(projMan);
        s.showSchedule();
        System.out.println(s.calculateTuition());
        System.out.println(s.calcTuitionFees());

        System.out.println("\nWhich course would you like to drop? Enter the Section Number, then press enter.");
        Scanner scanner = new Scanner(System.in);
        String courseToDrop = scanner.nextLine();
        if (courseToDrop.equals(busProg.getSectionNumber())) {
            s.dropSection(busProg);
        }
        else if (courseToDrop.equals(projMan.getSectionNumber())) {
            s.dropSection(projMan);
        }
        else {
            System.out.println("You've entered an invalid section number");
        }
        
        s.showSchedule();
        System.out.println(s.calculateTuition());
        System.out.println(s.calculateFees());
        System.out.println(s.calcTuitionFees());

    }
    
    
}
