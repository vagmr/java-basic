package src.chapter05.inderclass;


//内部类相关
public class Innerclass {
    public static void main(String[] args) {
        AAA aaa = new AAA();
    }
}
class AAA{
    private int age;
    private final double TAX = 0.8;//定义一个常量
    public String name;
    private void F1(){
        System.out.println("方法F1被调用");
    }

    public AAA(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    //定义一个无参构造器
    public  AAA(){
        System.out.println("这是一个无参构造器");
        class Inner{
            public int Ina;
            private void putdata(){
                System.out.println("Inter{" +
                        "age=" + age +
                        ", TAX=" + TAX +
                        ", name='" + name + "\'," +
                       "Ina=" + Ina +'}');
            }
        }
        Inner inner = new Inner();
        inner.putdata();
        F1();
    }

    @Override
    public String toString() {
        return "AAA{" +
                "age=" + age +
                ", TAX=" + TAX +
                ", name='" + name + '\'' +
                '}';
    }
}