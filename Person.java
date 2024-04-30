
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class Person {
    
    private String name;
    
    public Person() {
        
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void doPeopleThings() {
        System.out.println("*Talk, Walk, Eat*");
    }
    
    @Override
    public String toString() {
        return "The person is " + name;
    } 
    
    public String superDuperToString() {
        return super.toString();
    }
}
