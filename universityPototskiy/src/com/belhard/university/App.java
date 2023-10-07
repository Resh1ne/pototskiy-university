package com.belhard.university;

public class App {

    public static void main(String[] args) {
        Student student1 = new Student((long) 17,"Daniil", "Rega", 13, 2, 2005,  "FITU", "AA");
        System.out.println(student1.info());
        Student student2 = new Student((long) 5, "Ralf", "Blue", 21, 4, 2004,  "FITU", "AA");
        System.out.println(student2.info());
        Student student3 = new Student((long) 17, "Alla", "Green", 23, 6, 2005,  "FITU", "AA");
        System.out.println(student3.info());
        Student student4 = new Student((long) 6, "Lina", "Red", 6, 1, 2004,  "FITU", "AA");
        System.out.println(student4.info());
        Student student5 = new Student((long) 34, "Misha", "White", 30, 9, 2005,  "FITU", "AA");
        System.out.println(student5.info());
        Student student6 = new Student((long) 19, "Temor", "Kurs", 5, 12, 2004,  "FITU", "AA");
        System.out.println(student6.info());
        Teacher teacher = new Teacher((long) 1, "Sam", "Teach", 1, 1, 1950, 1, 5, 6000);
        System.out.println(teacher.info());
        Cleaner cleaner = new Cleaner((long) 1, "Oleg", "Clean", 10, 11, 1990, 5, 8, 900);
        System.out.println(cleaner.info());
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
        System.out.println("=================================================");

        Student student7 = new Student((long) 19,"Sasha", "Orange", 15, 3, 2004, "FITU", "AA");
        Student student8 = new Student((long) 6, "Grisha", "Red", 29, 1, 2004, "FITU", "AA");
        fs.addStudent(student1);
        fs.addStudent(student3);
        fs.addStudent(student6);
        fs.addStudent(student7);
        fs.addStudent(student8);
        fs.sortId();
        fs.info();
        System.out.println(fs.getSize());
    }
}
