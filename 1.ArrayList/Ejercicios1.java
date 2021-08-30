import java.util.ArrayList;
import java.util.List;

public class Ejercicios1 {

    public static void main(String[] args) {
        /*
        * Crea un ArrayList con 4 nombres de personas. Muestra su tamaño. 
        * Muestra el índice de alguno de tus nombres
        */
        List <String> names = new ArrayList<>();
        
        names.add("Pedro");
        names.add("Antonio");
        names.add("Luisa");
        names.add("Juan");
        
        System.out.println("Tamaño del array de nombres: " + names.size());
        System.out.println("El indice de Luisa es: " + names.indexOf("Luisa"));
        System.out.println("El indice de Antonio es: " + names.indexOf("Antonio"));
        System.out.println("El indice de Andrea (no existe) es: " + names.indexOf("Andrea"));
        
        
        /*
         * Crea un ArrayList con 4 enteros. Obtén el elemento en la tercera posición
         */
        List <Integer> numbers = new ArrayList<>();
        
        numbers.add(18);
        numbers.add(35);
        numbers.add(42);
        numbers.add(13);
        
        numbers.get(2);
        
        
        /*
         * Crea un ArrayList con 4 caracteres. Muestra su tamaño. 
         * Añade otro carácter. Muestra su tamaño.
         */
        List <Character> chars = new ArrayList<>();
        chars.add('c');
        chars.add('P');
        chars.add('r');
        chars.add('X');
        System.out.println("\nTamaño del array de caracteres: " + chars.size());
        
        chars.add('a');
        System.out.println("Tamaño del array de caracteres: " + chars.size());
        
        
        /*
         * Crea un ArrayList con 4 Personas. Las personas son unas entidades que
         * tienen nombre y edad, métodos para consultar y establecer estos atributos
         * y un método toString.
         */
        ArrayList<Persona> person = new ArrayList<>();
        person.add(new Persona("Jose", 19));
        person.add(new Persona("Alfredo", 75));
        person.add(new Persona("Diego", 38));
        person.add(new Persona("Miguel", 27));
        
        //Obtén el primer elemento de la lista y muéstralo
        System.out.println(person.get(0));
        
        //Crea otro ArrayList personas2. Asígnale la lista anterior. 
        List<Persona> person2 = person;
        
        //Crea un tercer ArrayList personas3. Clona el primer ArrayList de 
        //personas en este con el método clone.
        List<Persona> person3 = (ArrayList<Persona>)person.clone();
        
        
        /*
         * Crea un ArrayList de nombres de empresas de la localidad. 
         * Añade al menos 5. Comprueba si el elemento "ITP" está en la lista con
         * el método constains, si no está añádelo. A continuación vuelve a 
         * añadir el elemento "ITP". Ahora "ITP" debe estar dos veces en la lista.
         */
        List <String> companies = new ArrayList<>();
        
        companies.add("AutosLocos");
        companies.add("Consulting SA");
        companies.add("Motrileños SL");
        companies.add("IJH");
        companies.add("MER");
        
        if (!companies.contains("ITP")) {
            companies.add("ITP");
        }
        companies.add("ITP");
        
        //Obtén el índice del primer elemento "ITP". Obtén el índice del último
        //elemento "ITP" con el método lastIndexOf, guarda ese valor.
        System.out.println("Índice primer ITP: " + companies.indexOf("ITP"));
        int index = companies.lastIndexOf("ITP");
        System.out.println("Índice último ITP: " + index);
        
        //Utiliza el valor guardado para eliminar el elemento "ITP" repetido.
        companies.remove(index);
        
        //Borra el otro elemento "ITP" sin usar su índice
        companies.remove("ITP");
        
        
        /*
         * Crea un nuevo ArrayList de enteros. Asigna un elemento. Comprueba si 
         * el ArrayList está vacío, en caso contrario vacíalo. 
         * Vuelve a comprobar si está vacío. 
         */
        List <Integer> num = new ArrayList<>();
        
        num.add(99);
        
        if (!num.isEmpty()) {
            num.clear();            
        }
        
        if (num.isEmpty()) {
            System.out.println("\nEl array está vacío");            
        }
        
        
        /*
         * Crea un ArrayList con capacidad inicial para 50 Personas. 
         * Añade sólo dos elementos. Compueba su tamaño.
         */
        List <Persona> p50 = new ArrayList<>(50);
        p50.add(new Persona("Lope", 25));
        p50.add(new Persona("Vega", 35));
        
        System.out.println("\nTamaño de personas(capacidad 50): " + p50.size()); 
        
    }
    
}