package com.belhard.university;

public class Teacher extends Employee {
    private int id;

    Teacher(String firstName, String lastName, int day, int mounth, int year, int id, int experience, int workingHours,
            int salary) {
        super(firstName, lastName, day, mounth, year, experience, workingHours, salary);
        setId(id);
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

    @Override
    public void info() {
        System.out.print("\n" + "Teacher: ");
        System.out.println(getId() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t"
                + "Experience: " + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t"
                + "Salary: " + getSalary() + "BYN");
    }
}
