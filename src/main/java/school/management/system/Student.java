package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // creating new Student object by initializing
    public Student(int id, String name, int grade){

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // adding fees to feesPaid because the student will pay every semester for the school
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    // adding grade's setter because it will probably change in the future
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    // returns remaining fees
    public int getRemamingFees(){
        return feesTotal - feesPaid;
    }


}
