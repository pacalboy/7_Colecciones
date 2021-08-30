import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EjArrayList1_2 {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        //...
        System.out.println(nombres.size());
        System.out.println(nombres.indexOf("Juan"));
        
        List<Integer> edades = new ArrayList<>();
        edades.add(6);
        edades.add(6);
        edades.add(6567);
        edades.add(6);
        System.out.println(edades.get(2));
        
        List<Character> letras = new ArrayList<>();
        letras.add('e');
        letras.add('e');
        letras.add('e');
        System.out.println(letras.size());
        letras.add('¡');
        System.out.println(letras.size());
        
        List<Persona> personas = new ArrayList<>();
        personas.add( new Persona("Arancha",24) );
        System.out.println(personas.get(0));
        
        //Los punteros trabajan sobre el mismo array en memoria
        List<Persona> personas2 = personas;
        
        //Añade todos los elementos de una lista en otra
        List<Persona> personas3 = new ArrayList<>();
        personas3.add(new Persona("María",57));
        personas3.addAll(personas);
        System.out.println(personas3);
        
        //Copia la lista de forma inmutable (como final)
        List<Persona> personas4 = List.copyOf(personas);
        //personas4.add(new Persona("Pedro", 10)); <-- Error en tiempo de ejecución
        System.out.println(personas4);
        
        
        List<Persona> personas5 = new ArrayList<>();
        //Añadimos elementos nulos para conseguir el mismo tamaño (SOLUCION FEA)
        personas5.add(null);
        //Clase con métodos útiles para trabajar sobre colecciones del mismo tamaño
        Collections.copy(personas5, personas);
        System.out.println(personas5);
        
        
        List<String> empresas = new ArrayList<>();
        empresas.add("PROC");
        empresas.add("ÑAD");
        empresas.add("PC");
        if( ! empresas.contains("ITP") ){
            empresas.add("ITP");
        }
        empresas.add("ITP");
        System.out.println(empresas);
        System.out.println(empresas.indexOf("ITP"));
        int pos;
        System.out.println( pos = empresas.lastIndexOf("ITP"));
        //Borramos con el índice
        empresas.remove(pos);
        System.out.println(empresas);
        //Borramos a partir del elemento
        empresas.remove("ITP");
        System.out.println(empresas);
        
        List<Integer> num = new ArrayList<>();
        num.add(8);
        if( ! num.isEmpty() ){
            num.clear();
        }
        System.out.println("La lista está vacía:" + num.isEmpty());
    
        
        List<Persona> personasGrande = new ArrayList<>(50);
        personasGrande.add(new Persona("h", 2));
        personasGrande.add(new Persona("huu", 56));
        System.out.println(personasGrande.size());
    
        
        List<Integer> num10 = new ArrayList<>(10);
        for(int i=0; i<10 ; i++){
            num10.add(5);
        }
    
        List<Integer> num5 = new ArrayList<>(5);
        Random generador = new Random();
        for(int i=0; i<5 ; i++){
            //Números entre 10 y 50
            num10.add(generador.nextInt(40)+10);
        }
    
        String msg = "Hola buenos días";
        List<Character> msgLetras = new ArrayList<>(msg.length());
        for (int i = 0; i < msg.length() ; i++) {
            msgLetras.add( msg.charAt(i) );
        }
        
        Object mensaje [] = msgLetras.toArray();
        for(Object elem : mensaje)
            System.out.print(elem);
        
        List<Integer> num101 = new ArrayList<>(10);
        for(int i=0; i<10 ; i++){
            num101.add(i);
        }
        
        List<Boolean> num1010 = new ArrayList<>(20);
        for(int i=0; i<15 ; i++){
            num1010.add( !(i%2==0) );
        }
        //Para guardar los números:
        List<Integer> num10101 = new ArrayList<>(20);
        for(int i=0; i<15 ; i++){
            num10101.add( i%2 );
        }
        
        //Generador nombres aleatorios
        Faker faker = new Faker();
        for (int i = 0; i<50; i++) {
            personasGrande.add( new Persona(
                    faker.name().firstName(),
                    generador.nextInt(120) ) );
        }
    }
}
