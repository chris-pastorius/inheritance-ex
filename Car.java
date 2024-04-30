
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class Car extends Vehicle {
    
    int speed = 120;
    
    public void showSpeed() {
        System.out.println("Speed = " + speed);
        System.out.println("Parent speed = " + super.speed);
    }
    
}
