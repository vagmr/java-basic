package src.HouseRental.Model;

/**
 * HouseInformation的属性表示房屋的信息
 *
 * @author xgao
 * @version 0.01
 */
public class HouseInformation {
    private int id;
    private String houseMaster;
    private String tel;
    private String address;
    private int rent;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseMaster() {
        return houseMaster;
    }

    public void setHouseMaster(String houseMaster) {
        this.houseMaster = houseMaster;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public HouseInformation(int id, String houseMaster, String tel, String address, int rent, String state) {
        this.setId(id);
        this.setHouseMaster(houseMaster);
        this.setTel(tel);
        this.setAddress(address);
        this.setRent(rent);
        this.setState(state);
    }

    public HouseInformation() {
        System.out.println("调用无参构造器");
    }

    //为了实现更好的输出,编写一个toString方法

    @Override
    public String toString() {
        return  id +
                "\t\t" + houseMaster +
                "\t\t" + tel +
                "\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
