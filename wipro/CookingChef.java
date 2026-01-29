class cooking extends Thread{
    private String task;
    cooking(String task){
         this.task=task;
    }public void run(){
        System.err.println(task+ "  is cooked by "+ Thread.currentThread().getName());
    }
}
public class CookingChef {
    public static void main(String[] args) {
        Thread t1 = new cooking("pasta");
        Thread t2 = new cooking("Biryani");
        Thread t3 = new cooking("Chhole Bhature");
        Thread t4 = new cooking("Pulao chicken");
        t1.setName("Sanauwar");
        t2.setName("Danish");
        t3.setName("Shahnawaz");
        t4.setName("Shahid");
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
    
}
