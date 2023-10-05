package com.belhard.university;

class Student extends Person {
    private int id;
    private String faculty;
    private String speciality;

    Student(String firstName, String lastName, int day, int mounth, int year, int id, String faculty,
            String speciality) {
        super(firstName, lastName, day, mounth, year);
        setId(id);
        setFaculty(faculty);
        setSpeciality(speciality);
    }

    public void setId(int id) {
        if (id < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void info() {
        System.out.println(getId() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t"
                + getFaculty() + "\t" + getSpeciality());
    }
}
