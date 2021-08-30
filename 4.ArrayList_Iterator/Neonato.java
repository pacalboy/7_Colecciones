public class Neonato extends Infante{
    private String hospital;
    private String alergias;
    
    public Neonato(String nombre, int telefono1, String hospital, String alergias) {
        super(nombre, telefono1);
        this.hospital = hospital;
        this.alergias = alergias;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Alumno Neonato{" + "Nombre: " + super.getNombre() + "\tAlergias: " + alergias + '}';
    }

}
