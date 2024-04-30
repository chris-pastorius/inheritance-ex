
package Week3_Inheritance;

/**
 *
 * @author Chris Pastorius
 */
public class InterestRates {
    
    // Testing method overriding from super class (polymorphism)

    public static void main(String[] args) {
        
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        
        System.out.println("SBI rate of interest: " + s.getRateOfInterest());
        System.out.println("ICICI rate of interest: " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest: " + a.getRateOfInterest());
    }
}
