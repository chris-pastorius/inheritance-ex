
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class BusinessPerson extends Person {
    
    private String name, business;
    
    public BusinessPerson(String name, String business) {
        super(name);
        this.name = name;
        this.business = business;
    }
    
    public void runBusiness() {
        System.out.println("*Running business*");
    }
    
    public String toString() {
        return "Business person is " + name + " who runs " + business;
    }
    
}
