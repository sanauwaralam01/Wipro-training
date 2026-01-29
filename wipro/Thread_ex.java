/*public class Thread_ex  extends Thread{  //using extends keyword
    public void run(){
        System.out.println("Hi i am sanauwar");
    try{
        Thread.sleep(2000);
    }catch(Exception e){}
    System.out.println("I am an engineer");
}
    public static void main(String[] args) {
        Thread_ex t1=new Thread_ex();
        t1.start();
    }
}*/

public class Thread_ex  implements Runnable{  //using implements keyword
    public void run(){
        System.out.println("Hi i am sanauwar");
    try{
        Thread.sleep(2000);
    }catch(Exception e){}
    System.out.println("I am an engineer");
}
    public static void main(String[] args) {
        Thread_ex obj=new Thread_ex();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
