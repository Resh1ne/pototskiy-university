package com.belhard.university;

class Student extends Person {
    private String faculty;
    private String speciality;
    private double averageScore;
    private Integer[] assessments = new Integer[10];

    Student(Long id, String firstName, String lastName, int day, int mounth, int year, String faculty,
            String speciality) {
        super(id, firstName, lastName, day, mounth, year);
        setFaculty(faculty);
        setSpeciality(speciality);
        setAssessments();
    }

    private void setAssessments() {
        for (int i = 0; i < assessments.length; i++) {
            assessments[i] = ((int) (Math.random() * 11));
        }
    }

    public void getAssessments() {
        for (int i = 0; i < assessments.length; i++) {
            System.out.print(assessments[i] + "\t");
        }
    }

    public void setAverageScore() {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < assessments.length; i++) {
            sum += assessments[i];
            counter++;
        }
        this.averageScore = sum / counter;
        
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

    @Override
    public String info() {
        setAverageScore();
        return getId() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + getFaculty()
                + "\t" + getSpeciality();
    }
}
