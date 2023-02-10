package src.chapter06.Exception;

/**
 * @author vagmr
 * @version 0.0.1
 * 2022/12/19-19:40
 * Chapter04
 */
public class EXception01 {
    public static void main(String[] args){
        System.out.println(Exception02.method());
    }
}
class Exception02 {
    public static int method() {
        try {
            String[] art = new String[3];
            if(art[1].equals("xgao")){
                return 0;
            }
            else {
                art[3] = "name";
            }
            return 1;
        } catch (AbstractMethodError e){
            return  2;
        }catch (NullPointerException e) {
            return 3;
        } catch (ArithmeticException e){
            return 4;
        } finally {
            return 5;
        }
    }

}
