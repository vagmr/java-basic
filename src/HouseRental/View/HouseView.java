package src.HouseRental.View;


import src.HouseRental.Model.HouseInformation;
import src.HouseRental.Servicce.HouseService;
import src.HouseRental.utils.Utils;



public class HouseView {


    boolean opt = true;
    char choice;
    public int size = 2;
    private HouseService hv = new HouseService(size);



    public  void houseAdd(){
        System.out.println("--------------新增房屋--------------");
        System.out.print("姓名：");
        String name = Utils.readString(5);
        System.out.print("电话：");
        String tel = Utils.readString(11);
        System.out.print("地址：");
        String address = Utils.readString(16);
        System.out.print("月租：");
        int rent = Utils.readInt();
        System.out.print("状态：");
        String state = Utils.readString(3);
        HouseInformation Hn = new HouseInformation(0,name,tel,address,rent,state);
        if(hv.add(Hn)){
            System.out.println("新增房屋成功");
        } else {
            System.out.println("新增房屋失败");
        }
    }
    public  void houseList(){
        System.out.println("---------------房屋列表----------------");
        System.out.println("编号\t\t房主\t\t\t电话\t\t\t地址\t\t租金\t\t状态");
        HouseInformation[] Houses = hv.list();
        Houses = hv.housesPlus(Houses);
        for (int i = 0; i <Houses.length ; i++) {
            if(Houses[i] == null){
                System.out.println("\n--------------房屋列表显示完毕-----------\n");
                break;
            }
            System.out.println(Houses[i]);
        }
    }

    public void mainMenu() {
        do {
            System.out.println("--------------房屋出租系统---------------");
            System.out.println("\t\t1. 新增房屋");
            System.out.println("\t\t2. 查找房屋");
            System.out.println("\t\t3. 删除房屋");
            System.out.println("\t\t4. 修改房屋信息");
            System.out.println("\t\t5. 房屋列表");
            System.out.println("\t\t6. 退\t 出");
            System.out.println("请输入选择（1-6）");
            choice = Utils.readChar();
            switch (choice) {
                case '1':
                    System.out.println("\t\t\t  新 增");
                    houseAdd();
                    break;
                case '2':
                    System.out.println("查 找");
                    break;
                case '3':
                    System.out.println("删 除");
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    houseList();
                    break;
                case '6':
                    System.out.println("正在退出.........");
                    opt = false;
                    break;
            }


        } while (opt);
    }
}