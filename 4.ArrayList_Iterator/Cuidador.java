public class Cuidador {
    private String nombre;
    private double salario;
    private String dni;
    private long nSS;
    private String titulacion;

    public Cuidador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getnSS() {
        return nSS;
    }

    public void setnSS(long nSS) {
        this.nSS = nSS;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "Nombre: " + nombre + "\tSalario: " + salario + '}';
    }
    
}
