class Atm{
    private int amount = 20000;
    synchronized void Balance(){
        System.out.println(amount + " is your current amount");
    }   
    synchronized void withdraw(String Name,int Withdrawalamount){
         System.out.println(Name + " is withdrawing money"+ Withdrawalamount);
    if(amount >= Withdrawalamount){
        System.out.println("Wait ! your payment is processing");
    try
    {
	Thread.sleep(2000);
    }
    catch (InterruptedException e) {
            System.out.println("Transaction interrupted");
        }

            amount -= Withdrawalamount;
            System.out.println(Name + " withdrawal completed");
            System.out.println("Remaining balance: " + amount);

        } else {
            System.out.println("Insufficient balance for " + Name);
        }
    }
}

public class Bankaccount1{
public static void main(String[] args) {
 
	Atm account = new Atm();
    Thread t1 = new Thread(()->{
        account.Balance();account.withdraw("Sanauwar", 5000);
    });
    Thread t2= new Thread(()->{
        account.Balance();account.withdraw("Shahid", 6000);
    });
    Thread t3= new Thread(()->{
    account.Balance();account.withdraw("Shahbaz", 10000);
    });
    t1.start();
    t2.start();
    t3.start();


 
	}
 
}

