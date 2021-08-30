public class Empleado {
    private String nombre;
    private int departamento;
    private double salario;
    private String dni;
    private long nSS;
    private String titulacion;
    
    public Empleado(int departamento, String nombre) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return "Empleado{" + "nombre=" + nombre + ", departamento=" + departamento + ", salario=" + salario + ", dni=" + dni + ", nSS=" + nSS + ", titulación=" + titulacion + '}';
    }
    
}
