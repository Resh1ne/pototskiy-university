package com.belhard.university;

import java.util.Objects;

import com.belhard.university.util.DynamicArray;

class Group {
    private Teacher teacher;
    private DynamicArray students = new DynamicArray();
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
        students.add(student);
        students.size();
    }

    private void checkNubmerInGrops() {
        if (students.get(0) != null) {
            ((Student) students.get(0)).setNubmerInGroups(1);
        }

        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i + 1) == null) {
                break;
            } else {
                ((Student) students.get(i + 1)).setNubmerInGroups(((Student) students.get(i)).getNumberInGroups() + 1);
            }
        }
    }

    public void addStudent(Student student) {
        if (students.size() < 8) {
            setStudent(student);
        } else {
            throw new RuntimeException("Group is full!");
        }
    }

    public void getStudents() {
        checkNubmerInGrops();
        for(int i = 0; i < students.size(); i++) {
            Student student = (Student) students.get(i);
            System.out.println(student.toString());
        }
    }

    public void info() {
        getStudents();
        System.out.println(getTeacher());
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getSize() {
        return students.size();
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
