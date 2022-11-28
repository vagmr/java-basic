package src.chapter05;

public class CodeBook {
    public static void main(String[] args) {
        BB b1 = new BB();
    }
}
class AA{
    public static int n1 = getVal01();
    static{
        System.out.println("类aa的静态代码块");//(2)
    }
    public static int getVal01(){
        System.out.println("类AA的静态方法");//(1)
        return 10;
    }
    public int n2 = getVal02();

    {
        System.out.println("类AA的普通代码块");//(6)
    }
    public int getVal02(){
        System.out.println("类AA的普通方法");//(5)
        return 20;
    }
    public AA(){
        System.out.println("类AA的无参构造器");//(9)
    }

}
class BB extends AA{
    public static int n1 = getVal03();
    static{
        System.out.println("类BB的静态代码块");//(4)
    }
    public static int getVal03(){
        System.out.println("类BB的静态方法");//(3)
        return 20;
    }
    //类BB的普通属性
    public int n2 = getVal04();
    public int getVal04(){
        System.out.println("类BB的普通方法");//(7)
        return 23;
    }
    {
        System.out.println("类BB的普通代码块");//(8)
    }
    public BB(){
        System.out.println("类BB的无参构造器");//(10)
    }

}