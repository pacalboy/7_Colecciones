import java.util.Iterator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa itp = new Empresa();
        
        itp.addEmpleado(new Empleado(1, "Ángela"));
        itp.addEmpleado(new Empleado(3, "Celia"));
        
        Iterator<Empleado> it = itp.listaEmpleados.iterator();
                
        boolean seguir = true;
        while (seguir) {
            it = itp.listaEmpleados.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            System.out.println("Introduzca departamento y nombre para nuevo empleado");
            System.out.println("(Introduzca -1 para salir)");
            int n = sc.nextInt();
            if (n != -1) {
                itp.listaEmpleados.add(new Empleado(n, sc.next()));
            }else
                seguir = false;
        }
        
    }
    
}
