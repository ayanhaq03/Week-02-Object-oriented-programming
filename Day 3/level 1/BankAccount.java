public class BankAccount {
     

    static String Bankname = "SBI";
    private String accHolname ;
    final int accNumber ;
    static int  totalAcc = 0 ;
     
    BankAccount(String accHolname ,int accNumber){

        this.accHolname = accHolname;
        this.accNumber = accNumber;
        totalAcc++;
    }

    static int getTotalAccounts(){
         return totalAcc;
    }

     void display(){
    
        System.out.println("account holder name " + accHolname);
        System.out.println("bank name " + Bankname);
        System.out.println("account number  " + accNumber);
        System.out.println("total no of acc existing in bank "+ totalAcc);
        
     }
     


    public static void main(String[] args) {
        

        BankAccount acc1 = new BankAccount("ayan", 43245346);
        BankAccount acc2 = new BankAccount("nova", 43745346);

        if(acc1 instanceof BankAccount){
            acc1.display();
        }
        if(acc2 instanceof BankAccount){
            acc2.display();
        }

    }
}