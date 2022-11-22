package src.work;

public class work02 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("332",34,"333",566);
        System.out.println(t1);
        Teacher t2 = new Professor("23",32,"jyh1",876);
        System.out.println(t2);
    }
}
class Teacher{
    String name;
    int age;
    String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public Teacher() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Professor extends Teacher{
    public double getSalary(){
        return super.getSalary() * 1.3;
    }
    public Professor(String name, int age, String post, double salary){
        super(name,age,post,salary);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ",salary = " + getSalary() + '\'' +
                '}';
    }
}
class subProfessor extends Teacher{
    @Override
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ",salary = " + getSalary() + '\'' +
                '}';
    }
}
class instrcutor extends Teacher{
    public  double getsalary(){
        return super.getSalary() * 1.1;
    }
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ",salary = " + getSalary() + '\'' +
                '}';
    }
}
