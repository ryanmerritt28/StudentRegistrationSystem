package com.mycompany.merrittr_regsys_v2;

public class DomesticStudent extends Student {
    
    private static float tuition;

    public DomesticStudent() {}
    
    public DomesticStudent(int id, String name, String lname) {
        super(id, name, lname);
    }
    

    @Override
    public float calculateTuition() {
         tuition = 0;
        for (int i=0; i<curEnr.size(); i++) {
            tuition += (400 *curEnr.get(i).getCredits());
        }
        return tuition;
    }
}
