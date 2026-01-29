interface Drawable{
    void draw();
}

public class TestLamda {
    public static void main(String[]args){
        Drawable d=()->System.out.println("drawing"); //lambda function
            d.draw();
    };
}
