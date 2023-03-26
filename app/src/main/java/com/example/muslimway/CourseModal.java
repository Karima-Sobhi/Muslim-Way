package com.example.muslimway;

public class CourseModal {

    private String ZekrName;

    private int id;

    public String getZekrName() {
        return ZekrName;
    }

    public void setZekrName(String ZekrName) {
        this.ZekrName = ZekrName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // constructor
    public CourseModal(String ZekrName) {
        this.ZekrName = ZekrName;

    }
}