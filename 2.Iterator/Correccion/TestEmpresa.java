import java.util.Iterator;
import java.util.List;

public class TestEmpresa {

    public static void main(String[] args) {
        Empresa empr1 = new Empresa(
                "ITP", 
                new Empleado("Emilio", 0));
        
        empr1.addEmpleado(new Empleado("Luzdi",2));
        empr1.addEmpleado(new Empleado("Melody",1));
        
        /* Problema por devolver listas de empleados
        List<Empleado> jeje = empr1.getEmpleados();
        System.out.println(jeje);
        Iterator it = jeje.iterator();
        while( it.hasNext() ){
            Empleado e = (Empleado) it.next();
            e.setDepartamento(2346578);
        }
        System.out.println(jeje);
        */
        
        System.out.println(empr1.getInfoEmpleados());
        
        System.out.println(empr1);
    }
    
}
