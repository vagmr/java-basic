package src.HouseRental.Servicce;

import src.HouseRental.Model.HouseInformation;
import src.HouseRental.View.HouseView;
import src.HouseRental.utils.Utils;

public class HouseService {
    private HouseInformation[] houses;//保存信息到对象数组中
    private int houseNums = 1;
    public HouseService(int size){
        houses = new HouseInformation[size];//真正开辟对象数组
        houses[0] = new HouseInformation(1,"xgao","12334413","china",4222,"出租");
    }
    public boolean add(HouseInformation hN){
        if(houseNums >= houses.length){
            System.out.println("你是否要扩容房屋信息(y/n)");
            String opt = Utils.readString(1);
            if( !housepluschoice(opt)) {
                System.out.println("房屋信息已经不能添加");
            } else if(housepluschoice(opt)){
                return true;
            }
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
    //编写一个方法扩容数组
    public boolean housepluschoice(String opt){
        if("y".equals(opt)){
            System.out.println("房屋信息扩容成功");
            return true;
        }
        else {
            return false;
        }
    }
    public HouseInformation[] housesPlus(HouseInformation[] houses){
        HouseService h2 = new HouseService(new HouseView().size + 1);
        for (int i = 0; i <houses.length ; i++) {//给新数组赋值
            h2.houses[i] = houses[i];
        }
        houses = h2.houses;
        return h2.houses;
    }
}
