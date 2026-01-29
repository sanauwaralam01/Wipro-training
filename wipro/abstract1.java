abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle uses fuel");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with Key");
    }
}
public class abstract1{
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}
