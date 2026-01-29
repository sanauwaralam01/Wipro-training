class vehicle{
    String Brand;
    int speed;
    vehicle(String Brand,int speed){
        this.Brand=Brand;
        this.speed=speed;
    }
    void start(){
        System.out.println("vehicle is starting:");
    }
    void display(){
        System.out.println(" Brand name is :"+Brand);
        System.out.println("its speed is: " +speed+ " km/h");
    }
}
class Car extends vehicle{
    Car(String Brand,int speed){
        super(Brand,speed);
    }
}
class Bike extends vehicle{
    Bike(String Brand,int speed){
        super(Brand,speed);
    }
}
class Truck extends vehicle{
    Truck(String Brand,int speed){
        super(Brand,speed);
    }
}



public class Vehicle1 {
    public static void main(String[]args){
    vehicle v1=new Car("Bentley", 250);
    vehicle v2=new Bike("Royal Enfield", 120);
    vehicle v3=new Truck("Tata", 60);
    v1.display();
    v1.start();
    System.out.println();
    v2.display();
    v2.start();
    System.out.println();
    v3.display();
    v3.start();
    }
    
}
