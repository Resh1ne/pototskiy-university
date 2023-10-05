package com.belhard.university;

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

    public void getTeacher() {
        teacher.info();
    }

    public void setStudent(Student student) {
        this.students[countStudent] = student;
        this.countStudent++;
    }

    public void addStudent(Student student) {
        if (countStudent < 8) {
            setStudent(student);
        } else {
            throw new RuntimeException("Group is full!");
        }
    }

    private void checkId(int i) {
        for (; i < MAX_STUDENTS - 1; i++) {
            if (students[i + 1] == null) {
                break;
            } else {
                if (students[i].getId() == students[i + 1].getId()) {
                    this.students[i + 1].setId(students[i + 1].getId() + 1);
                }
            }
        }
    }

    public void sortId() {
        boolean flag = true;

        while (flag) {
            flag = false;
            int temp = 0;
            checkId(temp);

            for (int i = 0; i < MAX_STUDENTS - 1; i++) {
                if (students[i + 1] == null) {
                    break;
                } else {
                    if (students[i].getId() > students[i + 1].getId()) {
                        Student tempStudent;

                        tempStudent = this.students[i];
                        this.students[i] = this.students[i + 1];
                        this.students[i + 1] = tempStudent;
                        flag = true;
                        temp = i;
                    }
                }
            }
        }
    }

    public void getStudents() {
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getId() + "\t" + students[i].getSecondName() + "\t"
                        + students[i].getFirstName() + "\t" + students[i].getDateOfBrith() + "\t"
                        + students[i].getFaculty() + "\t" + students[i].getSpeciality());
            } else {
                break;
            }
        }
    }

    public void info() {
        getStudents();
        getTeacher();
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
}