import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Delhi");
        try {
            cities.add(null);
        } catch (NullPointerException e) {
            System.out.println("Catch Null value");
        }
        System.out.println(cities);

    }
}
