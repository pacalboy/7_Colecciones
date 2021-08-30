import java.util.Calendar;

public class Infante {
    private String nombre;
    private Calendar fechNac;
    private String alergias;
    private int telefono1;
    private int telefono2;

    public Infante(String nombre, int telefono1) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechNac() {
        return fechNac;
    }

    public void setFechNac(int dia, int mes, int anio) {
        this.fechNac = Calendar.getInstance();
        fechNac.set(anio, mes, dia);
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    @Override
    public String toString() {
        return "Infante{" + "Nombre: " + nombre + "\tTlfno_1: " + telefono1 + "\tTlfno_2: " + telefono2 + '}';
    }

}
