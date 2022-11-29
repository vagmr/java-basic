package src.chapter05;

public class AbstractExercise {
    public static void main(String[] args) {
        Employee[] ary = new Employee[2];
        ary[1] = new Manger();
        ary[0] = new ConmonEmpoyee();
        ary[0].work("xg",4,6666);
        ary[1].work("xd",7,4565);
        Manger mx = new Manger();
        //mx.work();
    }
}
abstract class Employee{
    public String name;
    public int id;
    public double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee(){
        System.out.println("无参构造器被调用");
    }
    public abstract void work(String name,int id,double salary);//定义一个抽象方法传入三个参数
}
class Manger extends Employee{
    public double bounds;

    public Manger(String name, int id, double salary, double bounds) {
        super(name, id, salary);
        this.bounds = bounds;
        System.out.println("S,i,d,d");
    }

    public Manger(double bounds) {
        this.bounds = bounds;
        System.out.println("(bouns)");
    }
    public Manger(){
        System.out.println("()");
    }

    public void work(String name, int id, double salary,double bounds){
        System.out.println("经理" + name + "工号" + id + "工作中" +
                "得到了" + salary +"薪水和"+ bounds +"奖金");
    }
    public void work(String name,int id,double salary){
        System.out.println("经理" + name + "工号" + id + "工作中");
    }

    @Override
    public String toString() {
        return "Manger{" +
                "bounds=" + bounds +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
class ConmonEmpoyee extends Employee{
    public ConmonEmpoyee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public ConmonEmpoyee() {
        System.out.println("()");
    }

    @Override
    public void work(String name, int id, double salary) {
        System.out.println("经理" + name + "工号" + id + "工作中");
    }
}

