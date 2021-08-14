package lab4p2_adrianburgos;
import java.util.Scanner;

public class Combustion extends Carros{
    static Scanner scan = new Scanner(System.in);
    
    private int consumocombus;
    private int duracionaceite;
    private int velocidad;
    private String cambio;

    public int getConsumocombus() {
        return consumocombus;
    }

    public void setConsumocombus(int consumocombus) {
        this.consumocombus = consumocombus;
    }

    public int getDuracionaceite() {
        return duracionaceite;
    }

    public void setDuracionaceite(int duracionaceite) {
        this.duracionaceite = duracionaceite;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    
    public void modificar() {
        System.out.println();
        System.out.println("Porfavor modifique su carro para calcular de nuevo");
        System.out.print("Ingrese nuevo modelo: ");
        super.setModelo(scan.nextLine());
        System.out.print("Ingrese nuevo VIN: ");
        super.setVIN(scan.nextLine());
        System.out.print("Ingrese nueva carroceria: ");
        super.setCarroceria(scan.nextLine());
        System.out.print("Ingrese nueva cantidad de pasajeros: ");
        super.setPasajeros(scan.nextInt());
        System.out.print("Ingrese nueva capacidad de maletero: ");
        super.setMaleterolts(scan.nextInt());
        System.out.print("Ingrese consumo de combustible(KPL): ");
        setConsumocombus(scan.nextInt());
        System.out.print("Ingrese duracion del aceite: ");
        setDuracionaceite(scan.nextInt());
        System.out.print("Ingrese velocidad maxima: ");
        setVelocidad(scan.nextInt());
        System.out.print("Ingrese tipo de cambio[Automatico/Manual]: ");
        String Borrador = scan.nextLine();
        setCambio(scan.nextLine());
    }
    
    @Override
    public int calculo() {
        int resultado = 2021-(super.getPasajeros()*consumocombus)-(duracionaceite*consumocombus);
        return resultado;
    }

    @Override
    public String toString() {
        return "Modelo: "+super.getModelo()+" \nVIN: "+super.getVIN()
                +"\nCarroceria: "+super.getCarroceria()+"\nCantidad de pasajeros: "+super.getPasajeros()
                +"\nCapacidad del maletero: "+super.getMaleterolts()+" litros"+"\nConsumo de combustible: "+consumocombus
                +"\nDuracion del aceite: "+duracionaceite+" meses"+"\nVelocidad maxima: "+velocidad
                +"\nTipo de cambio: "+cambio;
    }
}
