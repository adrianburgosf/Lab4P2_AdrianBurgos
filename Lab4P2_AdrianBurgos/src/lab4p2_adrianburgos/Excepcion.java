package lab4p2_adrianburgos;

public class Excepcion extends Exception{
    public Excepcion() {
        super("Rango de dias no permitido, deberia ser mayor de 30");
    }
    
    public Excepcion (String texto) {
        super(texto);
    }
}
