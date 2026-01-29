enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday

}
public class TestEnum2 {
    public static void main(String[] args) {
        Day[]allDays=Day.values();
        System.out.println("All Days of the week");
        for(Day d: allDays){
            System.out.println(d);
            /*Day[]workingDays=new Day[5];
            workingDays[0]=Day.Monday;
            workingDays[1]=Day.Tuesday;
            workingDays[2]=Day.Wednesday;
            workingDays[3]=Day.Thursday;
            workingDays[4]=Day.Friday;
            workingDays[5]=Day.Saturday;
            workingDays[6]=Day.Sunday;
            System.out.println(d);*/
        }
    }
}
