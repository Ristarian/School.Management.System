package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Teacher daria = new Teacher(1, "Daria", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher max = new Teacher(3, "Max", 700);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(daria);
        teacherList.add(melissa);
        teacherList.add(max);

        Student tatjana = new Student(1, "tatjana", 4);
        Student roger = new Student(2, "roger", 12);
        Student ristarian = new Student(3, "ristarian", 5);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(tatjana);
        studentList.add(roger);
        studentList.add(ristarian);

        School highSchool = new School(teacherList, studentList);
        System.out.println("High Shcool earned: $" + highSchool.getTotalMoneyEarned());



    }
}
