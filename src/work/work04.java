package src.work;

public class work04 {
    public static void main(String[] args) {
        STaff[] stf = new STaff[5];
        stf[0] = new farmer();
        stf[1] = new Scientist();
        stf[2] = new worker();
        stf[3] = new TEacher();
        stf[4] = new Waitess();
        for (int i = 0; i <stf.length ; i++) {
            stf[i].ReturnSalary();
        }
    }
}
class STaff{
    private double salary;
    private int dayNums;

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
    //以下是一个构造器


    public STaff(double salary, int dayNums) {
        this.salary = salary;
        this.dayNums = dayNums;
    }
    //下面是一个无参构造器

    public STaff() {
    }
    public void ReturnSalary(){
        System.out.println("方法被调用");
    }
}
class worker extends STaff{
    private static double salary = 3000;
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //打印本类的工资
    public void ReturnSalary(){
        System.out.println("工人的工资为" +worker.salary);
    }
}
class farmer extends STaff{
    private static double salary = 1200;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void ReturnSalary(){
        System.out.println("农民的工资为" + farmer.salary);
    }
}
class TEacher extends STaff{
    private static double salary = 4232;
    private static double teachAward = 78;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTeachAward() {
        return teachAward;
    }

    public void setTeachAward(double teachAward) {
        this.teachAward = teachAward;
    }
    public void ReturnSalary(){
        System.out.println("教师的工资为" + TEacher.salary + super.getDayNums() * TEacher.teachAward);
    }
}
class Scientist extends STaff{

}
class Waitess extends STaff{
    private static double salary = 3422;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void RuturnSalary(){
        System.out.println("服务员的工资为" + Waitess.salary);
    }
}
