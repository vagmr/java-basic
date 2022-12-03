package src.chapter05.inderclass;

public class Anonymous {
    public static void main(String[] args) {

    }
}

//定义一个接口
interface SnowLeopard {
    int Age = 18;
    String name = "顶针";

    void call();

    int sum();
}

class Dj {
    private double salary;
    private String information;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    //构造器
    public Dj(double salary, String information, SnowLeopard dj) {
        this.setSalary(salary);
        this.setInformation(information);
    }

    SnowLeopard dj = new SnowLeopard() {
        @Override
        public void call() {
            System.out.println("雪豹闭嘴");
        }

        public int sum(String name) {
            if ("雪豹闭嘴".equals(name)) {
                return 2;
            }
            return -1;
        }

        public int sum() {
            return 0;
        }
    };

    {
        dj.sum();
        System.out.println("我测你🐎妈");
        class DjInner {
            private static void say() {
                System.out.println("雪豹们闭嘴");
            }
        }
        DjInner.say();
    }

}