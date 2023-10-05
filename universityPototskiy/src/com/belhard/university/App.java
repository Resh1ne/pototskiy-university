package com.belhard.university;

public class App {

    public static void main(String[] args) {
        Student student1 = new Student("Daniil", "Rega", 13, 2, 2005, 17, "FITU", "AA");
        student1.info();

        Student student2 = new Student("Ralf", "Blue", 21, 4, 2004, 5, "FITU", "AA");
        student2.info();

        Student student3 = new Student("Alla", "Green", 23, 6, 2005, 17, "FITU", "AA");
        student2.info();

        Student student4 = new Student("Lina", "Red", 6, 1, 2004, 6, "FITU", "AA");
        student2.info();

        Student student5 = new Student("Misha", "White", 30, 9, 2005, 34, "FITU", "AA");
        student2.info();

        Student student6 = new Student("Temor", "Kurs", 5, 12, 2004, 19, "FITU", "AA");
        student2.info();

        Teacher teacher = new Teacher("Sam", "Teach", 1, 1, 1950, 1, 5, 6, 1000);
        teacher.info();

        Cleaner cleaner = new Cleaner("Oleg", "Clean", 10, 11, 1990, 5, 8, 900);

        System.out.println("=================================================");

        Group fs = new Group(teacher, student1);
        fs.addStudent(student2);
        fs.addStudent(student3);
        fs.addStudent(student4);
        fs.addStudent(student5);
        fs.addStudent(student6);

        fs.sortId();
        fs.info();
        System.out.println("=================================================");

        fs.removeStudent(student1);
        fs.removeStudent(student3);
        fs.removeStudent(student6);
        fs.info();
        cleaner.info();
        System.out.println("=================================================");
        
        Student student7 = new Student("Sasha", "Orange", 15, 3, 2004, 19, "FITU", "AA");
        Student student8 = new Student("Lina", "Red", 29, 1, 2004, 6, "FITU", "AA");
        fs.addStudent(student1);
        fs.addStudent(student3);
        fs.addStudent(student6);
        fs.addStudent(student7);
        fs.addStudent(student8);
        fs.info();
    }
}
