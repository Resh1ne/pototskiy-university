package com.belhard.university;

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
    public String info() {
        System.out.print("\n" + "Cleaner: ");
        return getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + "Experience: "
                + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t" + "Salary: " + getSalary()
                + "BYN" + "\t" + "Place for clean: " + getPlaceForClean();
    }
}
