import java.util.Calendar;

public class Infante implements Comparable<Infante>{
    private String nombre;
    private Calendar fechaNac;

    public Infante(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.fechaNac = Calendar.getInstance();
        this.fechaNac.set(anio, mes, dia);
    }

    public boolean equals(Infante otro){
        return this.nombre.equals(otro.nombre);
    }
    
    @Override
    public int compareTo(Infante otro) {
        if (this.equals(otro)) 
            return 0;
        else if (fechaNac.compareTo(otro.fechaNac) == -1)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Infante {" + "nombre: " + nombre + ", fechaNac: " + fechaNac + '}';
    }



    
    
    


    
    
}
