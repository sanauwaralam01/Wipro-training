interface calculation{
    int add(int a,int b);
}

public class Lambda1 {
    public static void main(String[]args){
        calculation c1=(a,b)->a+b;
        System.out.println(c1.add(10,20));
    }
}
