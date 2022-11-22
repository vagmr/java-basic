package src.HouseRental.Servicce;

import src.HouseRental.Model.HouseInformation;

public class HouseService {
    private HouseInformation[] houses;//保存信息到对象数组中
    private int houseNums = 1;
    public HouseService(int size){
        houses = new HouseInformation[size];//真正开辟对象数组
        houses[0] = new HouseInformation(1,"xgao","12334413","china",4222,"出租");
    }
    public boolean add(HouseInformation hN){
        if(houseNums >= houses.length){
            System.out.println("房屋信息已经不能添加");
            return false;
        }
        houses[houseNums++] = hN;
        hN.setId(houseNums + 1);
        return true;
    }

    //编写一个方法返回房屋的信息
    public HouseInformation[] list(){
        return houses;//house是一个对象数组
    }
}
