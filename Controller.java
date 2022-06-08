package PhucLuvMinP;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber=10000000;//cap so du ban dau
    private Scanner scanner= new Scanner(System.in);
    List<TransactionaHistory> listHistory ;
    public Controller(){
        this.listHistory = new ArrayList<>();
    }

    public long getBalanceNumber(){

        return balanceNumber;
    }
    public static long tranfer(long money){
        if(money>50000){
            if (balanceNumber>money){
                balanceNumber=balanceNumber-money;
                System.out.println("Chuyen Tien Thanh Cong");
            }else {
                System.out.println("So Du Khong Kha dung");
            }
        }else {
            System.out.println("Giao Dich phai lon hon 50000");
        }
        return balanceNumber;
    }
    public void actionTransfer(){
        System.out.println("Moi Ban Nhap Stk");
        String beneficiaryAccount = scanner.nextLine();
        System.out.println("Moi Ban Nhap Tien Gd");
        long money= scanner.nextLong();
        tranfer(money);

    }
    public void getHistory(){
        listHistory.toString();
    }
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }

}
