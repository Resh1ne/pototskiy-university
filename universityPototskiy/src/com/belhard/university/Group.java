package com.belhard.university;

import java.util.Objects;

class Group {
    private static final int MAX_STUDENTS = 8;
    private Teacher teacher;
    private Student[] students = new Student[MAX_STUDENTS];
    private int countStudent = 0;

    Group(Teacher teacher, Student student) {
        setTeacher(teacher);
        setStudent(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher.toString();
    }

    public void setStudent(Student student) {
        students[countStudent] = student;
        countStudent++;
    }

    private void checkNubmerInGrops() {
        for (int i = 0; i < MAX_STUDENTS - 1; i++) {
            if (students[i + 1] == null) {
                break;
            } else {
                students[i + 1].setNubmerInGroups(students[i].getNumberInGroups() + 1);
            }
        }
    }

    public void addStudent(Student student) {
        if (countStudent < 8) {
            setStudent(student);
        } else {
            throw new RuntimeException("Group is full!");
        }
    }

    public void getStudents() {
        checkNubmerInGrops();
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            } else {
                break;
            }
        }
    }

    public void info() {
        getStudents();
        System.out.println(getTeacher());
    }

    public void removeStudent(Student student) {
        Student[] newStudents = new Student[MAX_STUDENTS];
        int newIndex = 0;
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (students[i] != null) {
                if (students[i].getId() != student.getId()) {
                    newStudents[newIndex] = students[i];
                    newIndex++;
                }
            } else {
                break;
            }
        }
        countStudent--;
        this.students = newStudents;
    }

    public int getSize() {
        return this.countStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, countStudent, teacher);
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
        Group other = (Group) obj;
        return countStudent == other.countStudent//
                && Objects.equals(teacher, other.teacher)//
                && Objects.equals(students, other.students);
    }
}
