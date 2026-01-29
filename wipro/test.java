interface vehicle{
    void start();
    default void fueltype(){
        System.out.println("fueled");
    }
}
class carss implements vehicle{
    public void start(){
        System.out.println("Start with key");
    }
}

public class test {
    public static void main(String[] args) {
        vehicle v=new carss();
        v.start();
        v.fueltype();
    }
    
}
