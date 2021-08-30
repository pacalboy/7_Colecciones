import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Empresa {
    String nombre;
    Empleado director;
    Calendar fechaCreacion;
    List listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }
    
    public void addEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    
}
