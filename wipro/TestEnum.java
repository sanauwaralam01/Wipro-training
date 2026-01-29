/*enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

public class TestEnum {
    public static void main(String[]args){
        Day today = Day.Monday;
        System.out.println(today);
    }
    
}*/
enum status{
    Success(200),
    ERROR(500);
    private final int code;
    status(int code){
        this.code=code;
    }public int getCode(){
        return code;
    }
}

public  class TestEnum{
    public static void main(String[] args) {
        status Status=status.Success;
        System.out.println(Status);
        System.out.println(Status.getCode());
    }
}
