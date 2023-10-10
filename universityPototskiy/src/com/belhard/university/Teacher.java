package com.belhard.university;

import java.util.Objects;

public class Teacher extends Employee {
    private String subjectTaught;

    Teacher(Long id, String firstName, String lastName, int day, int mounth, int year, int experience, int workingHours,
            int salary) {
        super(id, firstName, lastName, day, mounth, year, experience, workingHours, salary);
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    @Override
    public String toString() {
        System.out.print("\n" + "Teacher: ");
        return getId() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t"
                + "Experience: " + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t"
                + "Salary: " + getSalary() + "BYN" + "\t" + "Subject Taught: " + getSubjectTaught();
    }

    @Override
    public void introduceYourself() {
        String format = "Hello! My name is %s %s, I teach discipline %s. I was born %s. I earn per month %sBYN%n";
        System.out.printf(format, getFirstName(), getSecondName(), subjectTaught, getDateOfBrith(), getSalary());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(subjectTaught);
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
        Teacher other = (Teacher) obj;
        return Objects.equals(subjectTaught, other.subjectTaught)//
                && super.equals(obj);
    }
}
