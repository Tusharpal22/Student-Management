package com.student.library.models;

public class StudentEntity {

    private int id;
    private String name;
    private String college;
    public StudentEntity() {
        this.college = "OUI";
    }

    public StudentEntity(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

}
