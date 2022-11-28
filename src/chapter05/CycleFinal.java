package src.chapter05;

public class CycleFinal {
    public static void main(String[] args) {
        double area = new Radius().getarea(12);
        System.out.println(area);
    }
}
class Radius{
    public final double PI;// = 3;定义时的优先级是最高的
    public Radius(){
        PI = 3.14;//构造器的优先级最低
    }
    {
      //  PI=3.14;代码块的优先级其次
    }
    public double getarea(int radius){
        return PI * radius *radius;
    }
}