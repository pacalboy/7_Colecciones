import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        
        TreeSet<Estudiante> tsEstudiante = new TreeSet<>();

        tsEstudiante.add(new Estudiante("Pedro P", 13));
        tsEstudiante.add(new Estudiante("María A", 24));
        tsEstudiante.add(new Estudiante("Pedro P", 18));
        tsEstudiante.add(new Estudiante("Pedro P", 16));
        tsEstudiante.add(new Estudiante("Pedro A", 13));
        tsEstudiante.add(new Estudiante("Juan Jesús", 32));
        tsEstudiante.add(new Estudiante("Alicia J", 51));
        tsEstudiante.add(new Estudiante("Inés Luz", 23));
        tsEstudiante.add(new Estudiante("Santiago M", 73));
        tsEstudiante.add(new Estudiante("Gracia MM", 21));
        
        Iterator it = tsEstudiante.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
                      
    }
    
}
