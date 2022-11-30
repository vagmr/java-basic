package src.chapter05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeabstract {
    public static void main(String[] args){
        TimeMethod timeMethod = new TimeMethod();
        timeMethod.timeCount();
        timeMethod.getDate();
    }
}
class TimeMethod{
    public void timeCount(){
        int sum = 0;
        double start = System.currentTimeMillis();
        double end;
        for (int i = 0; i < 120000; i++) {
            sum+=i;
            System.out.println("得出的sum值为" + sum + "用时为" +
                    (System.currentTimeMillis()-start) + "ms");
        }
        end = System.currentTimeMillis();
        System.out.println("整个循环过程共用时" + (end - start) + "ms");
    }
    //定义一个方法获得当前日期
    public void getDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}