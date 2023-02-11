package src.chapter06.Exception;

import java.util.Scanner;

/**
 * @author vagmr
 * @version 0.0.1
 * 2023/1/31-20:41
 * Chapter04
 */
public class t01 {
    // 主方法
    public static void main(String[] args) {
        // 定义一个整数类型的变量
        int a;
        // 定义一个字符串数组
        String[] b = new String[2];
        // 创建 Scanner 对象
        Scanner myscanner = new Scanner(System.in);
        // 打印提示信息
        System.out.println("请输入数字");
        // 读取用户输入的整数
        a = myscanner.nextInt();
        // 将代码放在 try-catch 块中
        try {
            // 使用 do-while 循环
            do {
                // 判断输入的数字是否不等于 1
                if (a != 1) {
                    // 如果不等于 1，打印“cu”并将 b[0] 设置为“cu”
                    System.out.println("cu");
                    b[0] = "cu";
                } else {
                    // 如果等于 1，打印“对”
                    System.out.println("对");
                }
                // 如果 b[1] 的值不等于“cu”，循环继续
            } while (!(b[1].equals("cu")));
        }
        // 捕获 NullPointerException 异常
        catch (NullPointerException e) {
            // 如果捕获到异常，打印“异常已经捕捉”
            System.out.println("异常已经捕捉");
        }
    }
}
