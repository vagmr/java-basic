package src.chapter05;

public class Tempararywork {
    public static void main(String[] args) {

    }
}
interface A{
    int x = 1;
}
class B{int x = 0;}
class C extends B implements A{
    public void printx(){
        System.out.println(A.x);
        System.out.println(new B().x);
        //这里可以使用super.x
        System.out.println(super.x);
    }
}