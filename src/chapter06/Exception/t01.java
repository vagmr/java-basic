package src.chapter06.Exception;

import java.util.Scanner;

/**
 * @author vagmr
 * @version 0.0.1
 * 2023/1/31-20:41
 * Chapter04
 */
public class t01 {
    public static void main(String[] args) {
        int a;
        String[] b = new String[2];
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入数字");
        a = myscanner.nextInt();
        try {
            do {
                if (a != 1) {
                    System.out.println("cu");
                    b[0] = "cu";
                } else {
                    System.out.println("对");
                }
            } while (!(b[1].equals("cu")));
        }
        catch (NullPointerException e){
            System.out.println("异常已经捕捉");
        }
    }
}
