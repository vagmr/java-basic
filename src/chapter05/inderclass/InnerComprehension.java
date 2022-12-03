package src.chapter05.inderclass;


public class InnerComprehension {
    public static void main(String[] args){
        IJ ij = new IJ();
        ij.B();
        ij.new AF().a();
        //真正的匿名内部类
        ij.e(new Io() {
            @Override
            public void d() {
                System.out.println("方法d被调用");
            }
        });
//        IJ.AF af = IJ.new AF();
    }
}
interface Io{
    void d();
}
class IJ {
    private int age;
    private String name;
    //定义一个成员内部类
    public class AF {
        public final void a(){
            System.out.println("方法a被调用");
        }
    }
    //定义一个局部内部类
    public void B(){
        class C{
            public void c(){
                System.out.println("方法c被调用");
            }
        }
        C c = new C();
        c.c();
    }

    public void e(Io io){
        io.d();
    }

}
