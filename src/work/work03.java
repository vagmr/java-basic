package src.work;

public class work03 {
    public static void main(String[] args) {
        Staff staff;
        staff = new DepatermentManger("12",32,30);
        staff.printSalary(staff.getSalary());
        staff = new OrdinaryEmployee("12",32,30);
        staff.printSalary(staff.getSalary());
    }
}
class Staff{
    private String name;
    private double salary = 12;
    private int dayNums;
    //以下为getset方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDayNums() {
        return dayNums;
    }

    public void setDayNums(int dayNums) {
        this.dayNums = dayNums;
    }
    //定义一个有参的构造器
    public Staff(String name, double salary, int dayNums) {
        this.setName(name);
        this.setSalary(salary);
        this.setDayNums(dayNums);
    }
    //定义一个无参的构造器
    public Staff(){

    }
    //以下为员工共的方法打印公资
    public double printSalary(double salary){
        System.out.println(salary);
        return salary;
    }
}
class DepatermentManger extends Staff{
    public double printsalary(double salary){
        salary = 1000 +super.getSalary() * getDayNums() * 1.2;
        System.out.println(salary);
        return salary;
    }

    public DepatermentManger(String name, double salary, int dayNums) {
        super(name, salary, dayNums);
    }

    public DepatermentManger() {
    }
}
class OrdinaryEmployee extends Staff{
    public double printSalary(double salary){
        salary = super.getSalary() * getDayNums() * 1.1;
        System.out.println(salary);
        return salary;
    }

    public OrdinaryEmployee(String name, double salary, int dayNums) {
        super(name, salary, dayNums);
    }

    public OrdinaryEmployee() {
    }
}