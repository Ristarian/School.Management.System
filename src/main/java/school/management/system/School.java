package school.management.system;

import java.util.List;

public class School {

    /*
    school will contain teachers and students but we are unable to assume
    how much of teachers and students will be in the future
    */

    private List<Teacher> teachers;
    private List<Student> students;

    // static means that elements belong to the class (not to their instance)
    // therefore we are abl to use them without need to create any instance of them
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // returns the list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // adds a teacher to the list
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // returns the list of students
    public List<Student> getStudents() {
        return students;
    }

    // adds a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // returns the total money earned by the school (from students)
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // adds the total money earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    // returns total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // update the money that is spent by the school (as a salary to the teachers)
    public static void updateTotalMoneySpent(int MoneySpent) {
        // totalMoneyEarned = totalMoneyEarned - moneySpent;
        totalMoneyEarned -= totalMoneySpent;
    }
}
