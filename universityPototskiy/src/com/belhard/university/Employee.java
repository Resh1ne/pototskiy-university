package com.belhard.university;

public class Employee extends Person {
    private Integer experience;
    private Integer workingHours;
    private Integer salary;

    Employee(Long id, String firstName, String lastName, int day, int mounth, int year, int experience,
            int workingHours, int salary) {
        super(id, firstName, lastName, day, mounth, year);
        setExperience(experience);
        setWorkigHours(workingHours);
        setSalary(salary);
    }

    public void setExperience(Integer experience) {
        if (experience < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setWorkigHours(Integer workingHours) {
        if (workingHours < 1 || workingHours > 8) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.workingHours = workingHours;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        if (salary < 0) {
            throw new RuntimeException();
        } else {
            this.salary = salary;
        }
    }

    public int getWorkigHours() {
        return workingHours;
    }

    @Override
    public String info() {
        return getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t" + "Experience: "
                + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t" + "Salary: " + getSalary()
                + "BYN";
    }
}
