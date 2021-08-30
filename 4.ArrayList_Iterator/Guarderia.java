import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Guarderia {
    private String nombre;
    private List alumnos;
    private List neonatos;
    private List cuidadores;

    public Guarderia(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Infante>();
        this.neonatos = new ArrayList<Neonato>();
        this.cuidadores = new ArrayList<Cuidador>();
    }
    
    public void matricularAlumno(Infante alumno){
        alumnos.add(alumno);
    }
    
    public void matricularNeonato(Neonato alumno){
        neonatos.add(alumno);
    }
    
    public void contratar(Cuidador cuidador){
        cuidadores.add(cuidador);
    }
    
    public void desmatricular(String nombre){
        Iterator<Infante> it = alumnos.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
            }
        }
    }
    
    public String getInfoAlumnos(){
        StringBuilder msg = new StringBuilder();
        Iterator<Infante> it = alumnos.iterator();
        while(it.hasNext()){
            msg.append(it.next()).append('\n');
        }
        return msg.toString();
    }
    
    public String getInfoCuidadores(){
        StringBuilder msg = new StringBuilder();
        Iterator<Cuidador> it = alumnos.iterator();
        while(it.hasNext()){
            msg.append(it.next()).append('\n');
        }
        return msg.toString();
    }
    
    public String isNeonato(String nombre){
        Iterator<Neonato> it = alumnos.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                return it.next().toString();
            }
        }
        return null;
    }
    
    public String getInfoGuarderia(){
        StringBuilder msg = new StringBuilder();
        msg.append(getInfoAlumnos()).append('\n').append(getInfoCuidadores());
        return msg.toString();
    }
    
}
