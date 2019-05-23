
import static java.lang.System.out;

public class BankAccount {
    
    private int accountNo;
    private String custName;
    private int balance;
    private static int totalCash;

    public static void showAvg(BankAccount tmp1, BankAccount tmp2, BankAccount tmp3){
                
        System.out.println("Avg Balance of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    public static void showAvg(BankAccount tmp1, BankAccount tmp2){
                
        System.out.println("Avg Balance of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    public static void showTotalCash(){
        out.println("TOTAL CASH  : "+totalCash);
    }
    public void showData(){
        System.out.println(accountNo+","+custName+","+balance);
    }                  
    public void setData(int a, String b, int c){
        accountNo=a;
        custName=b;
        balance=c;
        totalCash=totalCash+c;
    }

    
}
