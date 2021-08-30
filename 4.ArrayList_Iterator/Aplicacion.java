public class Aplicacion {

    public static void main(String[] args) {
        Guarderia g = new Guarderia("Garabatos");
        
        g.matricularNeonato(new Neonato("Joselito", 654, "Virgen Macarena", "penicilina"));
        g.matricularNeonato(new Neonato("Marina", 657, "Virgen Santa", "polvo"));
        g.matricularNeonato(new Neonato("Laura", 656, "Virgen Lopera", "lactosa"));
        
        g.matricularAlumno(new Infante("Rafa", 666));
        g.matricularAlumno(new Infante("Luis", 777));
        g.matricularAlumno(new Infante("Sonia", 677));
        
        System.out.println(g.getInfoAlumnos());
        
    }
    
}
