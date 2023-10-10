package com.belhard.university;

import java.util.Objects;

abstract class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBrith;

    Person(Long id, String firstName, String lastName, int day, int mounth, int year) {
        setId(id);
        setFirstName(firstName);
        setSecondName(lastName);
        setDateOfBrith(day, mounth, year);
    }

    public void setId(Long id) {
        if (id < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.id = id;
        }
    }

    public Long getId() {
        return id;
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

    abstract public void introduceYourself();

    @Override
    public int hashCode() {
        return Objects.hash(id, dateOfBrith, firstName, lastName);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.id//
                && Objects.equals(dateOfBrith, other.dateOfBrith)//
                && Objects.equals(firstName, other.firstName)//
                && Objects.equals(lastName, other.lastName);
    }
}
