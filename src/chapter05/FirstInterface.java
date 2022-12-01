package src.chapter05;

public interface FirstInterface {
    public static void main(String[] args) {
        Imple imple = new Imple();
        TEst.IMple(imple);
    }
    void say();
    void hi();
}
class Imple implements FirstInterface{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
class TEst{
    public static void IMple(FirstInterface inf){
        inf.hi();
        inf.say();
    }
}