
package Week3_Inheritance;

/**
 * @author chris-pastorius
 */
public class PersonDemo {

    public static void main(String[] args) {
       
        Person p = new Person();
        System.out.println(p);
        p = new Person("Bob");
        System.out.println(p);
        System.out.println();
        
        BusinessPerson bp = new BusinessPerson("Darrin McMillen", "Bakery");
        bp.runBusiness();
        bp.doPeopleThings();
        System.out.println(bp.toString());
        System.out.println(bp.superDuperToString());
        System.out.println();
        
        Person p2 = new Person();
        p2 = new BusinessPerson("A", "B");    
    }

}
