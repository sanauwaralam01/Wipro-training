import java .util.*;

public class SmartHomeTemperatureApp {
    public static void main(String[] args) {
        ArrayList<Double>temperature =new ArrayList<>();
        temperature.add(26.8);
        temperature.add(30.8);
        temperature.add(22.8);
        temperature.add(29.8);
        System.out.println("Temperature Analysis");
        for (Double temp:temperature){
            if(temp>28.0){
                System.out.println("High temperature alert: " +temp + "celcius");

            }/*else if(temp >=10.0 || temp<2=5){
                System.out.println("Normal temperature ");
            }*/else{
                System.out.println("Normal temperature "+ temp +"celcius");
            }
        }
        System.out.println("\n Temperature Values as String");
        for(Double temp:temperature){
            String value = Double.toString(temp);
            System.out.println(value);
        }

    }
}
