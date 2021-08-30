class Empleado {
    private String nombre;
    private int departamento;
    private float salario;
    private int dni;
    private int nss;
    private String titulacion;
    
    public Empleado(String nombre, int departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDepartamento() {
        return departamento;
    }

    public float getSalario() {
        return salario;
    }

    public int getDni() {
        return dni;
    }

    public int getNss() {
        return nss;
    }

    public String getTitulacion() {
        return titulacion;
    }

    @Override
    public String toString() {
        return "[" + "Nombre=" + nombre + ", dep=" + departamento + "]";
    }
    
    
    
}
