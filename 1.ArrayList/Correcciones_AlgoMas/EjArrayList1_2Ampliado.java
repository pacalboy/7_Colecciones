import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjArrayList1_2Ampliado {

    public static void mostrarNombre() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        //...
        System.out.println(nombres.size());
        System.out.println(nombres.indexOf("Juan"));
    }

    public static void mostrarEdades() {
        List<Integer> edades = new ArrayList<>();
        edades.add(6);
        edades.add(6);
        edades.add(6567);
        edades.add(6);
        System.out.println(edades.get(2));
    }

    public static void mostrarCaracteres() {
        List<Character> letras = new ArrayList<>();
        letras.add('e');
        letras.add('e');
        letras.add('e');
        System.out.println(letras.size());
        letras.add('¡');
        System.out.println(letras.size());
    }

    public static void copiasPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Arancha", 24));
        System.out.println(personas.get(0));

        //Los punteros trabajan sobre el mismo array en memoria
        List<Persona> personas2 = personas;

        //Añade todos los elementos de una lista en otra
        List<Persona> personas3 = new ArrayList<>();
        personas3.add(new Persona("María", 57));
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
    }

    public static void empresas() {
        List<String> empresas = new ArrayList<>();
        empresas.add("PROC");
        empresas.add("ÑAD");
        empresas.add("PC");
        if (!empresas.contains("ITP")) {
            empresas.add("ITP");
        }
        empresas.add("ITP");
        System.out.println(empresas);
        System.out.println(empresas.indexOf("ITP"));
        int pos;
        System.out.println(pos = empresas.lastIndexOf("ITP"));
        //Borramos con el índice
        empresas.remove(pos);
        System.out.println(empresas);
        //Borramos a partir del elemento
        empresas.remove("ITP");
        System.out.println(empresas);
    }

    public static void listasVacias() {
        List<Integer> num = new ArrayList<>();
        num.add(8);
        if (!num.isEmpty()) {
            num.clear();
        }
        System.out.println("La lista está vacía:" + num.isEmpty());
    }

    public static void arrayValores5() {
        List<Integer> num10 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            num10.add(5);
        }
    }

    public static void array5Aleatorios() {
        List<Integer> num5 = new ArrayList<>(5);
        Random generador = new Random();
        for (int i = 0; i < 5; i++) {
            //Números entre 10 y 50
            num5.add(generador.nextInt(40) + 10);
        }
    }

    public static void mensajeListToArray() {
        String msg = "Hola buenos días";
        List<Character> msgLetras = new ArrayList<>(msg.length());
        for (int i = 0; i < msg.length(); i++) {
            msgLetras.add(msg.charAt(i));
        }

        Object mensaje[] = msgLetras.toArray();
        for (Object elem : mensaje) {
            System.out.print(elem);
        }
    }

    public static void num0to10() {
        List<Integer> num101 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            num101.add(i);
        }
    }

    public static void num01Alternos() {
        List<Boolean> num1010 = new ArrayList<>(20);
        for (int i = 0; i < 15; i++) {
            num1010.add(!(i % 2 == 0));
        }
        //Para guardar los números:
        List<Integer> num10101 = new ArrayList<>(20);
        for (int i = 0; i < 15; i++) {
            num10101.add(i % 2);
        }
    }

    public static void rellenar2Personas(List<Persona> unaListaCualquiera) {
        unaListaCualquiera.add(new Persona("h", 2));
        unaListaCualquiera.add(new Persona("huu", 56));
        System.out.println(unaListaCualquiera.size());
    }

    public static int rellenarPersonas(List<Persona> lista, int n) {
        //Generador nombres aleatorios
        Faker faker = new Faker();
        Random generador = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(new Persona(
                    faker.name().firstName(),
                    generador.nextInt(120)));
        }
        return lista.size();
    }

    public static int cambiarA(int entero) {
        entero = 10;
        return entero;
    }

    private static void rellenar0to10(List<String> elementos) {
        for (int i = 0; i < 11; i++) {
            elementos.add("Elemento " + i);
        }
    }

    private static void mostrarLista(List<String> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " / ");
        }
    }

    public static void eliminaRepetidos(List<String> lista, String borrar) {
        /*for (int i = 0; i < lista.size() ; i++) {
            if(lista.get(i).equals(borrar)){
                lista.remove(i);
            }
        }
        
        while(lista.contains(borrar)){
            lista.remove(borrar);
        }

        int i = 0 ; 
        while(i<lista.size()){
            if(lista.get(i).equals(borrar)){
                lista.remove(i);
            }else{
                i++;
            }
        }
         */

        Iterator it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
            }
        }
    }

    public static void elimina0(List<Integer> l) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            if (it.next().equals(0)) {
                it.remove();
            }
        }
    }

    private static void personasMayusculas(List<Persona> listaDePersonas) {
        listaDePersonas.forEach(p -> {
            p.setNombre(p.getNombre().toUpperCase());
        });
    }

    public static void main(String[] args) {
        mostrarNombre();
        mostrarEdades();
        mostrarCaracteres();
        copiasPersonas();
        empresas();
        arrayValores5();
        array5Aleatorios();
        num0to10();
        num01Alternos();

        int a = 6;
        a = cambiarA(a);
        System.out.println(a);

        List<Persona> miListaPersonas = new ArrayList<>(50);
        rellenar2Personas(miListaPersonas);
        System.out.println(miListaPersonas);
        rellenarPersonas(miListaPersonas, 50);
        System.out.println(rellenarPersonas(miListaPersonas, 100));

        List<String> elementos = new ArrayList<>(11);
        rellenar0to10(elementos);
        elementos.add(3, "Elemento 4");
        mostrarLista(elementos);

        Random r = new Random();
        List<Integer> nAleatorios = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            nAleatorios.add(r.nextInt(10));
        }
        System.out.println(nAleatorios);
        Collections.sort(nAleatorios);
        System.out.println(nAleatorios);

        //3
        Scanner sc = new Scanner(System.in);
        List<Integer> nTeclado = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nTeclado.add(sc.nextInt());
        }
        System.out.println(nTeclado);
        elimina0(nTeclado);
        System.out.println(nTeclado);

        List<Persona> personitas = new ArrayList<>();
        rellenarPersonas(personitas, 4);
        System.out.println(personitas);
        personasMayusculas(personitas);
        System.out.println(personitas);
    }
}
