public class BankingProject {

    public static void main(String args[]) {
        BankAccount ac1=new BankAccount();
        BankAccount ac2=new BankAccount();
        BankAccount ac3=new BankAccount();
        
        ac1.setData(111, "AAA", 10000);
        ac2.setData(112, "BBB", 20000);
        ac3.setData(113, "CCC", 30000);
        
        ac1.showData();
        ac2.showData();
        ac3.showData();

        //ac3.showAvg(ac2);
        BankAccount.showAvg(ac1,ac2,ac3);
        BankAccount.showAvg(ac2, ac3);
        
        
        BankAccount.showTotalCash();
    }
}
