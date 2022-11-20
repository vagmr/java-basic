package src.HouseRental.View;

import java.util.Scanner;

public class HouseView {
    public static void main(String[] args) {


        boolean opt = true;
        Scanner myScanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("--------------房屋出租系统---------------");
            System.out.println("\t\t1. 新增房屋");
            System.out.println("\t\t2. 查找房屋");
            System.out.println("\t\t3. 删除房屋");
            System.out.println("\t\t4. 修改房屋信息");
            System.out.println("\t\t5. 房屋列表");
            System.out.println("\t\t6. 退\t 出");
            System.out.println("请输入选择（1-6）");
            choice = myScanner.next();
            switch (choice){
                case "1":
                    System.out.println("新 增");
                    break;
                case "2":
                    System.out.println("查 找");
                    break;
                case "3":
                    System.out.println("删 除");
                    break;
                case "4":
                    System.out.println("修 改");
                    break;
                case "5":
                    System.out.println("列 表");
                    break;
                case "6":
                    System.out.println("正在退出.........");
                    opt = false;
                    break;
            }

        } while (opt);
    }
}