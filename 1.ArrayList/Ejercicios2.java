import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicios2 {

    public static void main(String[] args) {
        /*
         * Crea un ArrayList de enteros de capacidad 10 y añade 10 elementos 
         * con el valor 5.
         */
        List <Integer> n = new ArrayList<>(10);
        
        for (int i = 0; i < 10; i++) {
            n.add(5);
        }
        
        
        /*
         * Crea un ArrayList de enteros de capacidad 5 
         * y añade 5 números aleatorios.
         */
        Random r = new Random();
        List <Integer> randomNum = new ArrayList<>(5);
        
        for (int i = 0; i < 5; i++) {
            randomNum.add(r.nextInt());
        }
        
        
        /*
         * Crea un String con un mensaje. 
         * Guarda cada caracter del mensaje en un elemento de un nuevo ArrayList
         * con la capacidad inicial del tamaño del mensaje.
         */
        String message = "Hola que tal";
        
        List <Character> messageChar = new ArrayList<>(message.length());
        
        for (int i = 0; i < message.length(); i++) {
            messageChar.add(message.charAt(i));
        }
        
        for (char c : messageChar) {
            System.out.println(c);
        }
        
        /**
         * Guarda este ArrayList con el mensaje en un Array estático[ ] de tipo char
         */
        Object[] staticArray = messageChar.toArray();
        
        for (Object c : staticArray) {
            System.out.println(c);
        }
        
        
        /*
         * Crea un ArrayList de enteros de capacidad 10 y añade 10 elementos 
         * desde el 0 al 9.
         */
        List <Integer> counter = new ArrayList<>(10);
        
        for (int i = 0; i < 10; i++) {
            counter.add(i);
        }
        
        
        /*
         * Crea un ArrayList de booleanos de capacidad 20 y añade 15 elementos 
         * alternando entre 0 y 1.
         */
        List <Boolean> booleans = new ArrayList<>(20);
        
        for (int i = 0; i < 15; i++) {
            if (i%2 == 0) {
                booleans.add(false);
            }else
                booleans.add(true);
        }
        
        for (boolean b : booleans) {
            System.out.println(b);
        }
        
        
        /*
         * Añade 50 elementos al ArrayList que declaraste con capacidad 50 
         * utilizando una estructura for. Para generar los elementos lo haremos 
         * de forma aleatoria con la buena librería Faker 
         * que podéis encontrar aquí: https://github.com/DiUS/java-faker
         */
        Faker faker = new Faker();
        
        for (int i = 0; i < 50; i++) {
            p50.add(new Persona(faker.name().firstName(), r.nextInt(121)));
        }
        
        for (Persona p:p50) {
            System.out.println(p);
        }
        
    }
    
}