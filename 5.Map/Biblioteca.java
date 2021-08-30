import com.github.javafaker.Book;
import com.github.javafaker.Faker;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Biblioteca {
    private static final String nombre = "Biblioteca Elena Martín Vivaldi";
    private static final String ubicacion = "Granada";
    private static float superficie;
    private static Map<String, Libro> libros = new TreeMap<>();
    private static Faker faker;
    private static Book book;

    private static String getNombre() {
        return nombre;
    }
    private static String getUbicacion() {
        return ubicacion;
    }
    private static float getSuperficie() {
        return superficie;
    }
    private static void setSuperficie(float superficie) {
        Biblioteca.superficie = superficie;
    }
    
    
    /**
     * Genera un código de 6 letras a partir del autor y el titulo.
     * @param l
     * @return codigo
     */
    private static String generarCodigo(Libro l){
        return l.getAutor().substring(0, 3).concat(l.getTitulo().substring(0, 3)).toUpperCase();
    }
    
    /**
     * Comprueba si un código ya está en la lista
     * @param codigo
     * @return 
     */
    private static boolean codigoRepetido(String codigo){
        for (Map.Entry mapElement : libros.entrySet()) {
            if (mapElement.getKey().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Añade un libro a la lista en caso de no estar el código repetido o si la 
     * lista está vacía
     * @param libro
     * @param codigo
     * @return 
     */
    private static boolean addBook(Libro libro, String codigo){
        if (!codigoRepetido(codigo) || libros.isEmpty()){
            libros.put(codigo, libro);
            return true;
        }
        return false;
    }
    
    /**
     * Intenta introducir un libro en la lista. Solicitará un código manual si
     * está repetido
     * @param libro 
     */
    private static void tryAddBook(Libro libro){
        Scanner sc = new Scanner(System.in);
        boolean conseguido = addBook(libro, generarCodigo(libro));
        while (!conseguido) {
            System.out.println("Código generado de libro inválido, "
                    + "por favor introduzca un código de 6 letras");
            String codigo = sc.next().toUpperCase();
            conseguido = addBook(libro, codigo);
        }
    }
    
    /**
     * Método con el que se solicitan los datos para introducir un libro
     * de forma manual
     */
    private static void introduceDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca título y autor");
        tryAddBook(new Libro(sc.nextLine(), sc.nextLine()));
    }    
    
    /**
     * Añade 100 libros fake
     */
    private static void cienLibrosFaker(){
        Scanner sc = new Scanner(System.in);
        faker = new Faker();
        book = faker.book();
        for (int i = 0; i < 100; i++) {
            tryAddBook(new Libro(book.title(), book.author()));
        }
    }
    
    private static void getBook(){
        for (Map.Entry mapElement : libros.entrySet()) {
            System.out.println(mapElement.getValue());
        }
    }
    
    private static String mostrarMenu(){
        return "\nIntroduzca opción:"
                + "\n\t1. Mostrar nombre"
                + "\n\t2. Mostrar ubicación"
                + "\n\t3. Mostrar superficie"
                + "\n\t4. Mostrar libros"
                + "\n\t5. Añadir libro"
                + "\n\t6. Añadir 100 libros con Faker"
                + "\n\t7. Salir";
    }
    
    private static int menu(int opcion){
        String msj = "";
        switch (opcion) {
            case 1:
                msj = "Nombre: " + getNombre();
                break;
            case 2:
                msj = "Ubicación: " + getUbicacion();
                break;
            case 3:
                msj = "Superficie: " + getSuperficie();
                break;
            case 4:
                getBook();
                break;
            case 5:
                introduceDatos();
                msj = "Libro introducido correctamente";
                break;
            case 6:
                cienLibrosFaker();
                msj = "Libros fake introducidos correctamente";
                break;
            case 7:
                msj = "Hasta pronto";
                break;
            default:
                msj = "Opción no disponible";
        }
        System.out.println(msj);
        return opcion;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion = 1;
        while (opcion != 7) {
            System.out.println(mostrarMenu());
            opcion = sc.nextInt();
            menu(opcion);
        }
        
    }

}
