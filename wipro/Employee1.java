class employee{
    String name;
    int id;
    int salary;
    employee(String name , int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displaydetails(){
        System.out.println("employee id: "+id);
        System.out.println("employee name: "+name);
        System.out.println("employee salary: "+salary);
    }
}
class Manager extends employee{
    Manager(int id , String name,int salary){
        super(name, id, salary); //inherited method from the super class.
    }
}
class Developer extends employee {
    

    Developer(int id, String name, int salary) {
        super(name, id, salary);
        
    }




}
public class Employee1 {
    public static void main(String[] args) {

        employee manager = new Manager(101, "Sanauwar", 50000);
        employee developer = new Developer(102, "Aman", 40000);

        manager.displaydetails();
        System.out.println();

        developer.displaydetails();
    }
}