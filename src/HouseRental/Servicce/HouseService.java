package src.HouseRental.Servicce;

import src.HouseRental.Model.HouseInformation;

public class HouseService {
    private HouseInformation[] houses;//保存信息到对象数组中
    public HouseService(int size){
        houses = new HouseInformation[size];//真正开辟对象数组
        houses[0] = new HouseInformation(13,"xgao","12334413","china",4222,"出租");
    }
    //编写一个方法返回房屋的信息
    public HouseInformation[] list(){
        return houses;//house是一个对象数组
    }
}
