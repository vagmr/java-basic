package src.chapter05.inderclass;

public class AnnoymousExercise {
    public static void main(String[] args) {
        cellPhone cellPhone = new cellPhone();
        cellPhone.alarmclock(cellPhone.c1);
        cellPhone.alarmclock(cellPhone.c2);
    }
}

interface Bell{
    void ring();
}
class cellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
    Bell c1 = new Bell(){
        public void ring(){
            System.out.println("懒猪起床了");
        }
    };
    Bell c2 = new Bell(){
        public void ring(){
            System.out.println("小伙伴起床了");
        }
    };

}