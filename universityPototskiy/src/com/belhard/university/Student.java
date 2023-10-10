package com.belhard.university;

import java.util.Objects;

class Student extends Person {
    private String faculty;
    private String speciality;
    private double averageScore;
    private Integer[] assessments = new Integer[10];
    private int numberInGroups = 0;

    Student(Long id, String firstName, String lastName, int day, int mounth, int year, String faculty,
            String speciality) {
        super(id, firstName, lastName, day, mounth, year);
        setFaculty(faculty);
        setSpeciality(speciality);
        setAssessments();
        setAverageScore();
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

    private void setAverageScore() {
        int counter = 0;
        double sum = 0;
        for (int i = 0; i < assessments.length; i++) {
            sum += assessments[i];
            counter++;
        }
        averageScore = sum / counter;
    }

    public int getNumberInGroups() {
        return numberInGroups;
    }

    protected void setNubmerInGroups(int numberInGroups) {
        if (numberInGroups < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.numberInGroups = numberInGroups;
        }
    }

    public double getAverageScore() {
        return averageScore;
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
    public String toString() {
        return getNumberInGroups() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t"
                + getFaculty() + "\t" + getSpeciality() + "\t" + getAverageScore();
    }

    @Override
    public void introduceYourself() {
        String format = "Hello! My name is %s %s, I'm studying for a specialty %s of the faculty of %s."
                + "%nI was born %s. My GPA: %s%n";
        System.out.printf(format, getFirstName(), getSecondName(), getFaculty(), getSpeciality(), getDateOfBrith(),
                averageScore);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(faculty, speciality);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return Objects.equals(faculty, other.faculty)//
                && Objects.equals(speciality, other.speciality)//
                && super.equals(obj);
    }
}
