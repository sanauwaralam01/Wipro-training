
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        File myFile = new File("mybook.txt");
        FileWriter writer = new FileWriter("mybook.txt");
        try{
            myFile.createNewFile();
            writer.write("welcome to my diary\n RAAH -E- ZINDAGI KUCH IS TARIKE SE GUZRI HAI AYE HAYAT \n NA HUM DEEN KE HUE , NA HI HAME DUNIA MILI \n NA HUM KHUD KE HUYE AUR NA HI HAME KHUDA MILA");
            writer.close();
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
