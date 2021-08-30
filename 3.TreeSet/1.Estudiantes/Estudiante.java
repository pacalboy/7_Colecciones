public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public boolean equals(Estudiante otro){
        return this.nombre.equals(otro.nombre);
    }
    
    @Override
    public int compareTo(Estudiante otro) {
        if(this.equals(otro))           //0 ->Condición para considerar repetido ->TreeSet no guarda
            return 0;
        else if(this.edad>otro.edad){   //1 -> Condición considerar mayor
            return 1;
        }else{                          //-1 -> Condición para considerar menor
            return -1;
        }
    }    

    @Override
    public String toString() {
        return "[Nombre=" + nombre + " \t Edad=" + edad + ']';
    }
    
}
