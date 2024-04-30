
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class DaysDemo {

    public static void main(String[] args) {
       
        DayOfWeek day = DayOfWeek.FRIDAY;
        
        if(day == DayOfWeek.FRIDAY) {
            System.out.println("Yay!");
        }
        
        DayOfWeek[] days = DayOfWeek.values();
        for (DayOfWeek day1 : days) {
            System.out.println(day1);
        }
        
    }

}
