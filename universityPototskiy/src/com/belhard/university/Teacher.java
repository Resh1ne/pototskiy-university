package com.belhard.university;

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
    public String info() {
        System.out.print("\n" + "Teacher: ");
        return getId() + "\t" + getSecondName() + "\t" + getFirstName() + "\t" + getDateOfBrith() + "\t"
                + "Experience: " + getExperience() + " years" + "\t" + "W.Hours: " + getWorkigHours() + "\t"
                + "Salary: " + getSalary() + "BYN" + "\t" + "Subject Taught: " + getSubjectTaught();
    }
}
