package com.belhard.university;

import java.util.Objects;

public class Cleaner extends Employee {
    private String placeForClean;

    Cleaner(Long id, String firstName, String lastName, int day, int mounth, int year, int experience, int workingHours,
            int salary) {
        super(id, firstName, lastName, day, mounth, year, experience, workingHours, salary);
    }

    public void setPlaceForClean(String placeForClean) {
        this.placeForClean = placeForClean;
    }

    public String getPlaceForClean() {
        return placeForClean;
    }

    @Override
    public String toString() {
        System.out.print("\n" + "Cleaner: ");
        return getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + "Experience: "
                + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t" + "Salary: " + getSalary()
                + "BYN" + "\t" + "Place for clean: " + getPlaceForClean();
    }

    @Override
    public void introduceYourself() {
        String format = "Hello! My name is %s %s, I've been a cleaner for %s years. I was born %s."
                + "%nI usually clean on the %s. I earn per month %sBYN%n";
        System.out.printf(format, getFirstName(), getSecondName(), getExperience(), getDateOfBrith(), placeForClean,
                getSalary());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(placeForClean);
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
        Cleaner other = (Cleaner) obj;
        return Objects.equals(placeForClean, other.placeForClean)//
                && super.equals(obj);
    }
}
