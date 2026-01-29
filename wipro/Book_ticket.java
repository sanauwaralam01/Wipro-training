class Book_ticket1 {
    int available_tickets=1;
    synchronized void book_ticket(String name){
        if(available_tickets>0){
            System.out.println(name+ " You are booking your Ticket ");
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            available_tickets--;
            System.out.println("Booked Successfully.");
        }else{
            System.out.println(name+ " sorry !ticket is not avalible");
        }
        
    }
    
}
public class Book_ticket{
    public static void main(String[] args) {
        Book_ticket1 tb = new Book_ticket1();
        Thread t1 = new Thread(() -> tb.book_ticket("Sanauwar"));
        Thread t2 = new Thread(() -> tb.book_ticket("Shahid"));
        t1.start();
        t2.start();
    }
}
