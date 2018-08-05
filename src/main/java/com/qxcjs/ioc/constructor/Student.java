package com.qxcjs.ioc.constructor;

public class Student {
    private String name;

    private int id;

    private School school;

    public Student(String name, int id, School school) {
        this.name = name;
        this.id = id;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", school=" + school +
                '}';
    }
}
