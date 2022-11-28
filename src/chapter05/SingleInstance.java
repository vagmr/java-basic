package src.chapter05;
//单例设计模式 饿汉式
public class SingleInstance {
    public static void main(String[] args) {
        Girlfriend ins = new Girlfriend().getGirlfriend();
        System.out.println(ins);
    }
}
class Girlfriend{
    private String name;
    private static Girlfriend gf = new Girlfriend("小白");
    private Girlfriend(String name){
        this.name = name;
    }
    public Girlfriend getGirlfriend(){
        return gf;
    }
    public Girlfriend(){

    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}