
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class DogEat extends AnimalEats {
    
    public void eat() {
        System.out.println("Eating dog food ...");
    }
    
    public void bark() {
        System.out.println("Bark bark bark!");
    }
    
    public void eatAndBark() {
        bark();
        super.eat();
    }
    
}
