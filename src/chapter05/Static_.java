package src.chapter05;

public class Static_ {
    public static void main(String[] args) {
        AS.age = 12;
        System.out.println(AS.age);

    }
}
class AS{
    public static int age;
    public static void numSum(int age){
        AS.age += age;
    }

    public AS() {
    }
}
