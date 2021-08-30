import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Crea una clase denominada Empresa que disponga de los siguientes atributos:
 * String nombre, Empleado director, Calendar fechaCreacion, ArrayList
 * listaEmpleados que contenga objetos de tipo Empleado. La clase debe tener un
 * método que permita añadir objetos de tipo Empleado a la lista. Un objeto de
 * tipo Empleado tendrá como atributos nombre (String) y departamento(int),
 * ambos requisito para poder construir el objeto, y otros atributos opcionales
 * como salario, número de seguridad social, dni y titulación. Existen todos los
 * métodos para obtener y establecer los atributos todos los atributos. Crea una
 * clase Test con el método main que inicialice un objeto Empresa y añade
 * manualmente dos objetos de tipo Empleado a la la lista de empleados. Usando
 * iterator muestra los nombres de cada empleado y su departamento. Se debe
 * pedir al usuario un nombre y departamento para añadir un nuevo empleado, y
 * una vez introducidos los datos mostrar la lista actualizada usando iterator.
 * Una vez mostrada la lista actualizada, se debe dar opción a elegir entre
 * volver a introducir los datos de otro empleado o salir del programa (se
 * podrán introducir tantos datos de empleados como se desee. Para ello usa un
 * bucle while que dé opción a elegir al usuario).
 *
 */
public class Empresa {
    private String nombre;
    private Empleado director;
    private Calendar fechaCreacion;
    private List<Empleado> empleados;

    public Empresa(String nombre, Empleado director) {
        this.nombre = nombre;
        this.director = director;
        fechaCreacion = Calendar.getInstance();
        empleados = new ArrayList<>();
    }
    
    public void addEmpleado(Empleado emp){
        empleados.add(emp);
    }

    public List<Empleado> getEmpleados(){
        return List.copyOf(empleados);
    }
    
    public String getInfoEmpleados(){
        StringBuilder msg = new StringBuilder();
        Iterator it = empleados.iterator();
        while(it.hasNext()){
            msg.append(it.next()).append('\n');
        }
        return msg.toString();
    }
    
    @Override
    public String toString() {
        return "Empresa: \n" + "\tNombre=" + nombre + "\n\tDirector=" + director + "\n\tCreacion=" + fechaCreacion + "\nEmpleados=" + getInfoEmpleados() + '}';
    }
    
    
}
