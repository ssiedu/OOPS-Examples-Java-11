public class BankingProject {

    public static void main(String args[]) {
        BankAccount ac1=new BankAccount(111,"AAA",10000);
        BankAccount ac2=new BankAccount(112,"BBB",20000);
        BankAccount ac3=new BankAccount(113,"CCC",30000);
        
        //ac1.setData(111, "AAA", 10000);
        //ac2.setData(112, "BBB", 20000);
        //ac3.setData(113, "CCC", 10000);
        
        ac1.showData();
        ac2.showData();
        ac3.showData();

        //BankAccount.showAvg(ac1,ac2,ac3);//{ac1,ac2,ac3}
        //BankAccount.showAvg(ac1,ac2);
        
        //BankAccount.showTotalCash();
        
        //boolean b=ac1.isEquals(ac3);
        //boolean b=BankAccount.isEquals(ac1, ac3);
        
        //System.out.println(b);
        
        
    }
}
