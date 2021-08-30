import java.util.Iterator;
import java.util.TreeSet;

public class GuarderiaMain {

    public static void main(String[] args) {
        
        TreeSet<Infante> guarderia = new TreeSet<>();
        
        guarderia.add(new Infante("Laura", 2, 4, 2018));
        guarderia.add(new Infante("Amanda", 15, 5, 2018));
        guarderia.add(new Infante("Jose", 24, 12, 2019));
        guarderia.add(new Infante("Amanda", 19, 11, 2018));
        guarderia.add(new Infante("Isaac", 27, 3, 2018));
        guarderia.add(new Infante("Andrea", 24, 2, 2019));
        guarderia.add(new Infante("Antonio", 5, 10, 2018));
        guarderia.add(new Infante("Luisa", 2, 6, 2018));
        guarderia.add(new Infante("Celia", 7, 6, 2019));
        guarderia.add(new Infante("Jose", 16, 8, 2019));
        
        Iterator it = guarderia.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("El más viejo: " + guarderia.last());
        System.out.println("El más joven: " + guarderia.first());
    }
    
}
