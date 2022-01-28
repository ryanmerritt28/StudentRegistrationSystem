package com.mycompany.merrittr_regsys_v2;

public class InternationalStudent extends Student {
    
    private static int tuition;

    public InternationalStudent() {}
    
    public InternationalStudent(int id, String name, String lname) {
        super(id, name, lname);
    }

    @Override
    public float calculateTuition() {
         tuition = 0;
        for (int i=0; i<curEnr.size(); i++) {
            tuition += (800 *curEnr.get(i).getCredits());
        }
        return tuition;
    }

    public boolean isFullTime() {
        return false;
    }
}
