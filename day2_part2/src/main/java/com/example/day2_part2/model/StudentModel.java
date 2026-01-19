package com.example.day2_part2.model;

public class StudentModel {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentModel(int id,String name,String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int id;
    private String name;
    private String email;

    public StudentModel(){
    }

}
