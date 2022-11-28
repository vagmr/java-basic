package src.chapter05;

public class SingleInstance01 {
    public static void main(String[] args) {
        Cat inu = Cat.getCat();
        System.out.println(inu);
    }
}
class Cat{
    //定义常量的尝试
    public static final int AGE = 18;
    private String name;
    private static Cat c1;
    private  Cat(String name){
        this.name = name;
    }
    public static Cat getCat(){
        if(c1 == null){
            c1 = new Cat("大沙暴");
        }
        return c1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test{
    public final double TAX;

    public Test() {
        TAX = 1;
    }
}