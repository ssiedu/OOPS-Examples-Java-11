
import static java.lang.System.out;

public class BankAccount {
    
    private int accountNo;
    private String custName;
    private int balance;
    private static int totalCash;
    
    
    
    public void showTotalCash(){
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
