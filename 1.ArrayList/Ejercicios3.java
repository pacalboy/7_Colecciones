import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios3 {
    
    public static void eliminaRepetidos(List list, String string){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(string)) {
                list.remove(i);
                i--;
            }
        }
    }
    
    public static void eliminaCero(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                list.remove(i);
                i--; //al eliminar un elemento hay que recorrer el mismo índice de nuevo
            }
        }
    }
    
    public static void personasMayusculas(ArrayList<Persona> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setNombre(list.get(i).getNombre().toUpperCase());
        }
    }
    
    public static void main(String[] args) {
        /*
         * Crea un ArrayList de cadenas de caracteres. Rellena la lista con 
         * cadenas como la siguiente: "Elemento 0", "Elemento 1", "Elemento 2"...
         * y así hasta el elemento 10.
         */
        List <String> strings = new ArrayList <>();
        
        for (int i = 0; i < 10; i++) {
            strings.add("Elemento " + i);
        }
        
        //Inserta la cadena "Elemento 4" en la posición 3.
        strings.add(2, "Elemento 4");
        
        //Muestra todos los elementos de la lista. "Elemento 4" debe aparecer repetido.
        System.out.println("Lista de \"Elementos\":");
        for (String s : strings) {
            System.out.println(s);
        }
        
        //Inserta "Elemento 4" al final de la lista.
        strings.add("Elemento 4");
        
        
        /*
         * Ejercicio:  crea un método eliminaRepetidos que reciba una lista como
         * parámetro y también un String que representará el contenido a borrar.
         * Utilizando una estructura for, compruebe todos los elementos del ArrayList
         * y borre aquellos que sean iguales al pasado como parámetro.
         */
        eliminaRepetidos(strings, "Elemento 4");
        
        System.out.println("\nLa lista tras eliminar los \"Elemento 4\":");
        for (String s : strings) {
            System.out.println(s);
        }
        
        
        /*
         * Crea una lista de 15 números enteros aleatorios. Muestra la lista.
         */
        Random r = new Random();
        
        List <Integer> randoms = new ArrayList<>();
        
        for (int i = 0; i < 15; i++) {
            randoms.add(r.nextInt(99));
        }
        System.out.println("\nLista de randoms:");
        for (int ran:randoms) {
            System.out.println(ran);
        }
        
        
        /*
         * Ordena la lista anterior utilizando el método sort que se encuentra 
         * en Collection (revisa documentación oficial para ver su uso). 
         * Muestra la lista de nuevo. 
         */
        Collections.sort(randoms);
        System.out.println("\nLista de randoms ordenada:");
        for (int ran:randoms) {
            System.out.println(ran);
        }
        
        
        /*
         * Crea una lista de números enteros. Añade 10 elementos por teclado con
         * una estructura for. Muestra el contenido de la lista.
         */
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        
        System.out.println("\n\nAñade 10 números");
        for (int i = 0; i < 10; i++) {
            nums.add(scan.nextInt());
        }
        System.out.println("\nLista de números introducidos:");
        for (int n:nums) {
            System.out.println(n);
        }
        
        
        /**
         * Ejercicio: crea un método que elimine los números 0 del arrayList
         */
        eliminaCero(nums);
        
        System.out.println("\nLista con los 0 eliminados:");
        for (int n:nums) {
            System.out.println(n);
        }
        
        
        /*
         * Crea una lista de personas. Añade 4 personas.
         */
        ArrayList<Persona> persons = new ArrayList<>();
        
        persons.add(new Persona("juan", r.nextInt(121)));
        persons.add(new Persona("andrea", r.nextInt(121)));
        persons.add(new Persona("andrés", r.nextInt(121)));
        persons.add(new Persona("ángela", r.nextInt(121)));
        
        
        /*
         * Ejercicio: crea un método llamado PersonasMayusculas que reciba un 
         * arrayList de tipo Persona y recorra todos los elementos modificando 
         * el nombre de cada Persona pasándolo a mayúsculas.
         */
        personasMayusculas(persons);
        
        System.out.println("\n\nLista de personas con nombres en mayúsculas:");
        for (Persona p:persons) {
            System.out.println(p);
        }
        
    }
    
}
