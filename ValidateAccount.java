package PhucLuvMinP;

public class ValidateAccount {
    public final String MOBILE="0392078390";
    public final String PASSWORLD="PhucLuvMinP";
    public boolean checkAcount(String mobile,String passworld){
        if (mobile.equals(MOBILE)){
            if (passworld.equals(PASSWORLD)){
                System.out.println("Dang Nhap Thanh Cong");
                return true;
            }else {
                System.out.println("Mat Khau Khong Chinh Xac!");
                return false;
            }
        }else {
            System.out.println("Vui Long Kiem Tra Lai Tai Khoan Mat Khau");
            return false;
        }
    }
}
