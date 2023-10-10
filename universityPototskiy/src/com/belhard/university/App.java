package com.belhard.university;

public class App {

    public static void main(String[] args) {
        Student student1 = new Student(1L, "Gabril", "Rega", 13, 2, 2005, "FITU", "AA");
        System.out.println(student1.toString());
        Student student2 = new Student(2L, "Ralf", "Blue", 21, 4, 2004, "FITU", "AA");
        System.out.println(student2.toString());
        Student student3 = new Student(3L, "Alla", "Green", 23, 6, 2005, "FITU", "AA");
        System.out.println(student3.toString());
        Student student4 = new Student(4L, "Lina", "Red", 6, 1, 2004, "FITU", "AA");
        System.out.println(student4.toString());
        Student student5 = new Student(5L, "Misha", "White", 30, 9, 2005, "FITU", "AA");
        System.out.println(student5.toString());
        Student student6 = new Student(6L, "Temor", "Kurs", 5, 12, 2004, "FITU", "AA");
        System.out.println(student6.toString());
        Teacher teacher = new Teacher(7L, "Sam", "Teach", 1, 1, 1950, 1, 5, 6000);
        teacher.setSubjectTaught("matemathic");
        System.out.println(teacher.toString());
        Cleaner cleaner = new Cleaner(8L, "Oleg", "Clean", 10, 11, 1990, 5, 8, 900);
        cleaner.setPlaceForClean("first floor");
        cleaner.introduceYourself();
        System.out.println(cleaner.toString());
        System.out.println("=================================================");

        Group fs = new Group(teacher, student1);
        fs.addStudent(student2);
        fs.addStudent(student3);
        fs.addStudent(student4);
        fs.addStudent(student5);
        fs.addStudent(student6);

        fs.info();

        teacher.introduceYourself();
        student1.introduceYourself();
        System.out.println("=================================================");

        fs.removeStudent(student1);
        fs.removeStudent(student3);
        fs.removeStudent(student6);
        fs.info();
        System.out.println("=================================================");

        Student student7 = new Student(9L, "Sasha", "Orange", 15, 3, 2004, "FITU", "AA");
        Student student8 = new Student(10L, "Grisha", "Red", 29, 1, 2004, "FITU", "AA");
        fs.addStudent(student1);
        fs.addStudent(student3);
        fs.addStudent(student6);
        fs.addStudent(student7);
        fs.addStudent(student8);
        fs.info();
        System.out.println(fs.getSize());
    }
}
