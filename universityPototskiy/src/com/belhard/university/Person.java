package com.belhard.university;

class Person {
    private String firstName;
    private String lastName;
    private String dateOfBrith;

    Person(String firstName, String lastName, int day, int mounth, int year) {
        setFirstName(firstName);
        setSecondName(lastName);
        setDateOfBrith(day, mounth, year);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }

    public void setDateOfBrith(int day, int month, int year) {
        if (day > 30 || day < 1 || month > 12 || month < 1 || year < 1900 || year > 2023) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.dateOfBrith = day + "/" + month + "/" + year;
        }
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }
}
