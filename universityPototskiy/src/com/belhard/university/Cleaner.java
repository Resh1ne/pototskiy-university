package com.belhard.university;

public class Cleaner extends Employee {

    Cleaner(String firstName, String lastName, int day, int mounth, int year, int experience, int workingHours,
            int salary) {
        super(firstName, lastName, day, mounth, year, experience, workingHours, salary);
    }

    @Override
    public void info() {
        System.out.print("\n" + "Cleaner: ");
        System.out.println(getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + "Experience: "
                + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t" + "Salary: " + getSalary()
                + "BYN");
    }
}
