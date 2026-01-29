public class Exceptionhandle_ex {
    public static void main(String[]args){
        try {
            int a =50;
            int b=0;
            int result=a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program continue......");
    }
}
