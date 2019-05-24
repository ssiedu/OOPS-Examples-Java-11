
import static java.lang.System.out;

public class BankAccount {
    
    private int accountNo;
    private String custName;
    private int balance;
    private static int totalCash;

    public static boolean isEquals(BankAccount tmp1, BankAccount tmp2){
        boolean result=(tmp1.balance==tmp2.balance);
        return result;
    }
    
    public static void showAvg(BankAccount...tmp){
        int size=tmp.length;
        int total=0;
        for(int i=0; i<size; i++){
            total=total+tmp[i].balance;
        }
        System.out.println("AVG BALANCE : "+total/size);
    }

  
    public static void showTotalCash(){
        out.println("TOTAL CASH  : "+totalCash);
    }
    public void showData(){
        System.out.println(accountNo+","+custName+","+balance);
    }                  
    public BankAccount(int a, String b, int c){
        accountNo=a;
        custName=b;
        balance=c;
        totalCash=totalCash+c;
    }

    
}
