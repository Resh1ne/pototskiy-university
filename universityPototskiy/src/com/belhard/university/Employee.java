package com.belhard.university;

public class Employee extends Person {
    private int experience;
    private int workingHours;
    private int salary;

    Employee(String firstName, String lastName, int day, int mounth, int year, int experience, int workingHours,
            int salary) {
        super(firstName, lastName, day, mounth, year);
        setExperience(experience);
        setWorkigHours(workingHours);
        setSalary(salary);
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setWorkigHours(int workingHours) {
        if (workingHours < 1 || workingHours > 8) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.workingHours = workingHours;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new RuntimeException();
        } else {
            this.salary = salary;
        }
    }

    public int getWorkigHours() {
        return workingHours;
    }

    public void info() {
        System.out.println(getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + "Experience: "
                + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t" + "Salary: " + getSalary()
                + "BYN");
    }
}
